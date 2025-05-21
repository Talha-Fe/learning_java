package cis112_week07.theory.linkQueue;

class LinkQueue {
	private FirstLastList theList;

	public LinkQueue() {
		theList = new FirstLastList();
	} // make a 2-ended list

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	/**
	 * insert, rear of queue
	 * 
	 * @param j
	 */
	public void insert(double j) {
		theList.insertLast(j);
	}

	/**
	 * remove, front of queue
	 * 
	 * @return
	 */
	public double remove() {
		return theList.deleteFirst();
	}

	public void displayQueue() {
		System.out.print("Queue (front-->rear): ");
		theList.displayList();
	}

}
