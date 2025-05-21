package cis112_week07.theory.firstLastList;

class FirstLastList {
	
	private Link first; // ref to first link
	private Link last; // ref to last link

	public FirstLastList() {
		first = null; // no links on list yet
		last = null;
	}

	/**
	 * true if no links
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * insert at front of list
	 * 
	 * @param dd
	 */
	public void insertFirst(double dd) {
		Link newLink = new Link(dd); // make new link

		if (isEmpty()) // if empty list,
			last = newLink; // newLink <-- last
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	/**
	 * insert at end of list
	 * 
	 * @param dd
	 */
	public void insertLast(double dd) {
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.next = newLink; // old last --> newLink
		last = newLink; // newLink <-- last
	}

	/**
	 * delete first link
	 * 
	 * @return
	 */
	public double deleteFirst() { // (assumes non-empty list)
		double temp = first.dData;
		if (first.next == null) // if only one item
			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // head at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // print value
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
}
