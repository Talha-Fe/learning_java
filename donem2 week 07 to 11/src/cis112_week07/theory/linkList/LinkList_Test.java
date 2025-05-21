package cis112_week07.theory.linkList;

class LinkList_Test {
	
	public static void main(String[] args) {
		LinkList theList = new LinkList();

		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);

		theList.displayList();

		while (!theList.isEmpty()) {
			Node aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList();
	}
	
}