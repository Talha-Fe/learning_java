package cis112_week09.lab;

import cis112_week09.theory.LibTree;
import cis112_week09.theory.MyBinaryTree;
import cis112_week09.theory.MyBinaryTreeConstructor;

public class MyBinaryTreeConstructorExtended_Test {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = false;
	private static final boolean DEBUG_M = true; // show method name

	public static void main(String[] args) {
		constructBT_I_Test();
//		constructBT_S_Test();
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
		tree = MyBinaryTreeConstructorExtended.constructBT_I_empty();

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
//		tree = MyBinaryTreeConstructorExtended.constructBT_S_Full_Level3();
		tree = MyBinaryTreeConstructorExtended.constructBT_S_ExpressionQuadratic();

		// check
		LibTree.treeInfo(tree);
	}

}
