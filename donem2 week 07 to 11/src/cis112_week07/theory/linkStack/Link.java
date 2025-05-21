package cis112_week07.theory.linkStack;

class Link {
	
	public double dData; // value item
	public Link next; // next link in list

	public Link(double dd) {
		dData = dd;
	}

	public void displayLink() {
		System.out.print(dData + " ");
	}
	
}
