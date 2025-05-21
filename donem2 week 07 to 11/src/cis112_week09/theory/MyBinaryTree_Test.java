package cis112_week09.theory;

public class MyBinaryTree_Test {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG_M = true; // show method name

	public static void main(String[] args) {
//		constructBT_Expression_NotRecomended();
//		height_BT_1_2_3_5();
		height_constructBT_S_1_6();
	}

	private static void height_BT_1_2_3_5() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<Integer> tree = MyBinaryTreeConstructor.constructBT_I_1_2_3_5();
		tree.plot();

		MyBinaryTree<Integer> treeTmp;

		treeTmp = tree;
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());

		treeTmp = tree.left();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());

		treeTmp = tree.right();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());
	}

	private static void height_constructBT_S_1_6() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree = MyBinaryTreeConstructor.constructBT_S_1_6();
		tree.plot();

		MyBinaryTree<String> treeTmp;

		// level 0
		treeTmp = tree;
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());
		// level 1
		treeTmp = tree.left();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());

		treeTmp = tree.right();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());
		// level 2
		treeTmp = tree.left().left();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());

		treeTmp = tree.left().right();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());

		treeTmp = tree.right().left();
		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());

//		treeTmp = tree.right().right();
//		System.out.println("\n node:" + treeTmp.data() + ", height:" + treeTmp.height());
	}

	/**
	 * Another but difficult way to construct trees. It does not scale. You may need
	 * to use tree2, tree3, ....
	 * 
	 * @return
	 */
	private static MyBinaryTree<String> constructBT_Expression_NotRecomended() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// ( 2 - 5 ) * ( 7 + 8 )
		MyBinaryTree<String> tree;
		MyBinaryTree<String> tree0;
		MyBinaryTree<String> tree1;
		MyBinaryTree<String> treeL;
		MyBinaryTree<String> treeR;
		// 2 - 5
		treeL = new MyBinaryTree<>("2");
		treeR = new MyBinaryTree<>("5");
		tree0 = new MyBinaryTree<>("-", treeL, treeR);
		// 7 + 8
		treeL = new MyBinaryTree<>("7");
		treeR = new MyBinaryTree<>("8");
		tree1 = new MyBinaryTree<>("+", treeL, treeR);
		// ( 2 - 5 ) * ( 7 + 8 )
		tree = new MyBinaryTree<>("*", tree0, tree1);

		// check
		tree.plot();
		System.out.println("\ncanonical:" + tree.canonical());

		return tree;
	}

}
