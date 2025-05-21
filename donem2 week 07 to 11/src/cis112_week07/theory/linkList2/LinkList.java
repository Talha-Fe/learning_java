package cis112_week07.theory.linkList2;

class LinkList {

	private Link first; // ref to first link on list

	public LinkList() {
		first = null; // no links on list yet
	}

	/**
	 * make new link
	 * 
	 * @param examID
	 * @param dd
	 */
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first; // it points to old first link
		first = newLink; // now first points to this
	}

	/**
	 * find link with given key
	 * 
	 * @param key
	 * @return
	 */
	public Link find(int key) { // (assumes non-empty list)
		Link current = first; // head at 'first'
		while (current.iData != key) // while no match,
		{
			if (current.next == null) // if end of list,
				return null; // didn't find it
			else // not end of list,
				current = current.next; // go to next link
		}
		return current; // found it
	}

	/**
	 * delete link with given key
	 * 
	 * @param key
	 * @return
	 */
	public Link delete(int key) {
		// (assumes non-empty list)
		Link current = first; // search for link
		Link previous = first;
		while (current.iData != key) {
			if (current.next == null)
				return null; // didn't find it
			else {
				previous = current; // go to next link
				current = current.next;
			}
		}
		// found it
		if (current == first) // if first link,
			first = first.next; // change first
		else // otherwise,
			previous.next = current.next; // bypass it
		return current;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // head at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print value
			current = current.next; // move to next link
		}
		System.out.println("");
	}

}
