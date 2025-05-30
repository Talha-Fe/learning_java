package cis112_week09.bjeo7_ch17;

/**
 * This class demonstrates the tree class.
 */
public class Tree_Demo {
	
	public static void main(String[] args) {
		Tree t1 = new Tree("Anne");
		Tree t2 = new Tree("Peter");
		t1.addSubtree(t2);
		Tree t3 = new Tree("Zara");
		t1.addSubtree(t3);
		Tree t4 = new Tree("Savannah");
		t2.addSubtree(t4);
		System.out.println("Size: " + t1.size());
	}
	
}
