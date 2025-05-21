package cis112_week07.theory.doublyLinked;

class DoublyLinkedList {

	private Node first; // ref to first item
	private Node last; // ref to last item

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	/**
	 * true if no nodes
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * insert at front of list
	 * 
	 * @param value
	 */
	public void insertFirst(double data) {
		Node node = new Node(data);
		if (isEmpty()) {
			last = node;
		} else {
			first.previous = node;
		}
		node.next = first;
		first = node;
	}

	/**
	 * insert at end of list
	 * 
	 * @param value
	 */
	public void insertLast(double data) {
		Node node = new Node(data);
		if (isEmpty()) {
			first = node;
		} else {
			last.next = node;
		}
		node.previous = last;
		last = node;
	}

	/**
	 * delete first node
	 * 
	 * @return
	 */
	public Node deleteFirst() {
		// (assumes non-empty list)
		Node temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	/**
	 * delete last node
	 * 
	 * @return
	 */
	public Node deleteLast() {
		// (assumes non-empty list)
		Node temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	/**
	 * insert value just after key
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean insertAfter(double key, double data) {
		// (assumes non-empty list)
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null)
				return false;
		}
		Node node = new Node(data);

		if (current == last) {
			node.next = null;
			last = node;
		} else {
			node.next = current.next;
			current.next.previous = node;
		}
		node.previous = current;
		current.next = node;
		return true;
	}

	/**
	 * delete item w/ given key
	 * 
	 * @param key
	 * @return
	 */
	public Node deleteKey(double key) {
		// (assumes non-empty list)
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}

	public void displayForward() {
		System.out.print("List (first-->last): ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}

	public void displayBackward() {
		System.out.print("List (last-->first): ");
		Node current = last;
		while (current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println("");
	}
}
