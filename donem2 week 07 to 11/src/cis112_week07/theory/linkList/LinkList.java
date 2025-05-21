package cis112_week07.theory.linkList;

class LinkList {
	
	private Node first; // ref to first link on list

	public LinkList() {
		first = null; // no links on list yet
	}

	public boolean isEmpty() {
		return (first == null);
	}

	/**
	 * insert at head of list
	 * 
	 * @param examID
	 * @param dd
	 */
	public void insertFirst(int id, double dd) {
		Node newLink = new Node(id, dd);
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	/**
	 * delete first item
	 * 
	 * @return
	 */
	public Node deleteFirst() {
		// (assumes list not empty)
		Node temp = first; // save reference to link
		first = first.next; // delete it: first-->old next
		return temp; // return deleted link
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Node current = first; // head at beginning of list
		while (current != null) {
			current.displayLink(); // print value
			current = current.next; // move to next link
		}
		System.out.println("");
	}

}
