package cis112_week09.lab;

import cis112_week09.theory.MyBinaryTree;

public class LibTreeExtended_Test {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = false;
	private static final boolean DEBUG_M = true; // show method name

	public static void main(String[] args) {

		// size
//		size_tree_Integer_Test();
//		size_tree_String_Test();

		// find
		find_tree_Integer_Test();
		find_tree_String_Test();
	}

	/*
	 * size
	 */

	private static void size_tree_Integer_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<Integer> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_I_empty();
		tree = MyBinaryTreeConstructorExtended.constructBT_I_1_2_3_5();
		System.out.println("\nsize:" + LibTreeExtended.size(tree.getRoot()));
	}

//	private static void size_constructBT_empty_Test() {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
//
//		MyBinaryTree<Integer> tree;
//		tree = MyBinaryTreeConstructorExtended.constructBT_empty();
//		System.out.println("\nsize:" + LibTreeExtended.size(tree.root()));
//	}

//	private static void size_BT_1_2_3_5_Test() {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
//
//		MyBinaryTree<Integer> tree;
//		tree = MyBinaryTreeConstructorExtended.constructBT_1_2_3_5();
//		System.out.println("\nsize:" + LibTreeExtended.size(tree.root()));
//	}

	private static void size_tree_String_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_Full_Level3();
		System.out.println("\nsize:" + LibTreeExtended.size(tree.getRoot()));
	}

	/*
	 * find
	 */

	private static void find_tree_Integer_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<Integer> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_I_empty();
		System.out.println("\nsize:" + LibTreeExtended.find(tree, 99));
	}

	private static void find_tree_String_Test() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t();
		System.out.println("\nsize:" + LibTreeExtended.find(tree, "99"));
	}

}
