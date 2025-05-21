package cis112_week07.theory.linkStack;

class LinkList {

	private Link first; // ref to first item on list

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	/**
	 * insert at head of list
	 * 
	 * @param dd
	 */
	public void insertFirst(double dd) { // make new link
		Link newLink = new Link(dd);
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	/**
	 * delete first item
	 * 
	 * @return
	 */
	public double deleteFirst() { 
		// (assumes list not empty)
		Link temp = first; // save reference to link
		first = first.next; // delete it: first-->old next
		return temp.dData; // return deleted link
	}

	public void displayList() {
		Link current = first; // head at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print value
			current = current.next; // move to next link
		}
		System.out.println("");
	}

}
