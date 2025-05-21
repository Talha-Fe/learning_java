package cis112_week10.theory;

public class MyBST_Test {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = false;

	public static void main(String[] args) {
		// plot the base tree
		MyBST<String> tree = MyBSTConstructor.constructBST_S_5836417();
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}

		/*
		 * insert
		 * 
		 * is tested in MyBSTConstructor_Test
		 */

		/*
		 * search
		 */
		search("5");
		search("1");
		search("8");
		search("99"); // not found

		/*
		 * transplant
		 */
		transplant(tree.root, new String[] { "7", "6", "8" });
		transplant(tree.root.right, new String[] { "7", "6", "8" });


		/*
		 * CLRS
		 */
		clrs12_2();
		
		/*
		 * delete
		 */
		delete_1();
		
		clrs12_4a();
		clrs12_4b();
		clrs12_4c();
		clrs12_4d();

	}

	private static void clrs12_2() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = MyBSTConstructor.constructBST_S_CLRS12_2();
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}

		MyNodeBST<String> node;

		node = tree.search("13");
		System.out.println("search 13:" + node);

		System.out.println("\nminimum:" + tree.minimum());
		node = tree.root.right;
		System.out.println("tree.minimum(tree.root.right): " + node + " min:" + tree.minimum(node));
		node = tree.root.right.right;
		System.out.println("tree.minimum(tree.root.right.right): " + node + " min:" + tree.minimum(node));

		System.out.println("\nmaximum:" + tree.maximum());
		node = tree.root.right;
		System.out.println("tree.maximum(tree.root.right): " + node + " max:" + tree.maximum(node));
		node = tree.root.right.right;
		System.out.println("tree.maximum(tree.root.right.right): " + node + " max:" + tree.maximum(node));
		//
		node = tree.root.left;
		System.out.println("tree.maximum(tree.root.left): " + node + " max:" + tree.maximum(node));
		node = tree.root.left.left;
		System.out.println("tree.maximum(tree.root.left.left): " + node + " max:" + tree.maximum(node));

		System.out.println("\nsuccessor:" + tree.successor());
		node = tree.root.left;
		System.out.println("tree.maximum(tree.root.left): " + node + " successor:" + tree.successor(node));
		node = tree.root.left.right.right;
		System.out.println("tree.maximum(tree.root.left.right.right): " + node + " successor:" + tree.successor(node));

		System.out.println("\npredecessor of 15:" + tree.predecessor());
	}

	private static void clrs12_4a() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = MyBSTConstructor.constructBST_S_CLRS12_4a();
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		MyNodeBST<String> z = tree.search("4");
		tree.delete(z);
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

	private static void clrs12_4b() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = MyBSTConstructor.constructBST_S_CLRS12_4b();
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		MyNodeBST<String> z = tree.search("4");
		tree.delete(z);
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

	private static void clrs12_4c() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = MyBSTConstructor.constructBST_S_CLRS12_4c();
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		MyNodeBST<String> z = tree.search("4");
		tree.delete(z);
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

	private static void clrs12_4d() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = MyBSTConstructor.constructBST_S_CLRS12_4d();
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		MyNodeBST<String> z = tree.search("04");
		tree.delete(z);
		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

	/**
	 * Search value in the tree of constructBST_S_5836417.
	 * 
	 * @param value
	 */
	private static void search(String data) {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = MyBSTConstructor.constructBST_S_5836417();
		MyNodeBST<String> node = tree.search(data);
		if (DEBUG2) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		if (DEBUG) {
			System.out.println("value:" + data);
			System.out.println(node);
		}
	}

	/**
	 * Create a new subtree {@code v} based on {@code arr}. Transplant {@code v} in
	 * the tree of constructBST_S_5836417.
	 * 
	 * @param u   location of transplant
	 * @param arr definition of new subtree
	 */
	private static void transplant(MyNodeBST<String> u, String[] arr) {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		System.out.println("u:" + u);

		MyBST<String> tree = MyBSTConstructor.constructBST_S_5836417();
		if (DEBUG2) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		MyBST<String> treeV = MyBSTConstructor.constructFromArray(arr);
		if (DEBUG2) {
			System.out.println("v:");
			treeV.plot();
			tree.transplant(u, treeV.root);
		}

		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

	/*
	 * delete
	 */

	private static void delete_1() {
		MyBST<String> tree = MyBSTConstructor.constructBST_S_5836417();
		if (DEBUG2) {
			tree.plot();
			System.out.println(tree.canonical());
		}
		tree.delete(null);
		MyNodeBST<String> n8 = tree.root.right;
		String[] arr = { "7", "6", "8" };
		MyBST<String> treeV = MyBSTConstructor.constructFromArray(arr);
		tree.transplant(n8, treeV.root);

		if (DEBUG) {
			tree.plot();
			System.out.println(tree.canonical());
		}
	}

}
