package cis112_week07.theory.linkList2;

class Link {
	
	public int iData; // value item (key)
	public double dData; // value item
	public Link next; // next link in list

	public Link(int id, double dd) {
		iData = id;
		dData = dd;
	}

	public void displayLink() {
		System.out.print("{" + iData + ", " + dData + "} ");
	}

}
