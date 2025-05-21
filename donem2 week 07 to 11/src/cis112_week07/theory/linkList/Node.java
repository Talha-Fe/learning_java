package cis112_week07.theory.linkList;

/** 
 * Node for singly linked list
 */
class Node {

	public int iData; // value item
	public double dData; // value item
	public Node next; // next link in list

	public Node(int id, double dd) {
		iData = id;
		dData = dd;
		next = null;
	}

	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "} ");
	}

}
