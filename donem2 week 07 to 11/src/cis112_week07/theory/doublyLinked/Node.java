package cis112_week07.theory.doublyLinked;

/** 
 * Node for doubly linked list
 */
class Node {

	public double data; // value item
	public Node next; // next link in list
	public Node previous; // previous link in list

	public Node(double d) {
		data = d;
	}

	public void displayNode() {
		System.out.print(data + " ");
	}

}
