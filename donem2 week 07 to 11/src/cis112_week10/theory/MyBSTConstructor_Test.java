package cis112_week10.theory;

public class MyBSTConstructor_Test {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = true;

	public static void main(String[] args) {
		MyBST<String> tree;
		
//		tree = MyBSTConstructor.constructBST_S_empty();
//		tree = MyBSTConstructor.constructBST_S_1();
//		tree = MyBSTConstructor.constructBST_S_12();
//		tree = MyBSTConstructor.constructBST_S_412();
//		tree = MyBSTConstructor.constructBST_S_5836417();
//		tree = MyBSTConstructor.constructBST_S_CLRS12_2();
//		tree = MyBSTConstructor.constructBST_S_412_nodeByNode();
		tree = MyBSTConstructor.constructBST_S_1_19a();
		//
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		tree = MyBSTConstructor.constructBST_S_1_19b();
		//
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

}
