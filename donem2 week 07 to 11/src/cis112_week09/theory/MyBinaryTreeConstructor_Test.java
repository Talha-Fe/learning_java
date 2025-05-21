package cis112_week09.theory;

public class MyBinaryTreeConstructor_Test {

	private static final boolean DEBUG_M = true; // show method name

	public static void main(String[] args) {
//		constructBT_I_Test();
//		constructBT_S_Test();
		constructBT_S_Expression_Test();
	}

	/*
	 * BT constructor
	 */

	private static void constructBT_I_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<Integer> tree;

		// select a constructor
		tree = MyBinaryTreeConstructor.constructBT_I_1_2_3_5();

		// check
		LibTree.treeInfo(tree);
	}

	private static void constructBT_S_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;

		// select a constructor
		tree = MyBinaryTreeConstructor.constructBT_S_t();
		tree = MyBinaryTreeConstructor.constructBT_S_t_l();
		tree = MyBinaryTreeConstructor.constructBT_S_t_r();
		tree = MyBinaryTreeConstructor.constructBT_S_t_lr();
//		tree = BinaryTreeG_Generator.constructBT_S_t_lr_ll_llr();
//		tree = BinaryTreeG_Generator.constructBT_S_1_6();
//		tree = BinaryTreeG_Generator.constructBT_S_Expression();

		// check
		LibTree.treeInfo(tree);
	}

	private static void constructBT_S_Expression_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;

		// select a constructor
		tree = MyBinaryTreeConstructor.constructBT_S_Expression();

		// check
		LibTree.treeInfo(tree);
	}

}
