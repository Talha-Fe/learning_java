package cis112_week07.theory.linkStack;

class LinkStack {

	private LinkList theList;

	public LinkStack() {
		theList = new LinkList();
	}

	/**
	 * put item on top of stack
	 * 
	 * @param j
	 */
	public void push(double j) {
		theList.insertFirst(j);
	}

	/**
	 * take item from top of stack
	 * 
	 * @return
	 */
	public double pop() {
		return theList.deleteFirst();
	}

	public boolean isEmpty() {
		return (theList.isEmpty());
	}

	public void displayStack() {
		System.out.print("Stack (top-->bottom): ");
		theList.displayList();
	}

}
