package cis112_week07.theory.linkQueue;

class Link {
	
	public double dData; // value item
	public Link next; // next link in list

	public Link(double d) {
		dData = d;
	}

	public void displayLink() {
		System.out.print(dData + " ");
	}

}
