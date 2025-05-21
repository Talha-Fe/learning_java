package cis112_week09.lab;

import cis112_week09.theory.MyBinaryTree;
import cis112_week09.theory.MyBinaryTreeConstructor;

/**
 * Extends {@code BinaryTreeG_Generator} by adding a few new methods.
 * 
 * @author bingol
 */
public class MyBinaryTreeConstructorExtended extends MyBinaryTreeConstructor {

	private static final boolean DEBUG = false;
	private static final boolean DEBUG2 = false;
	private static final boolean DEBUG_M = true; // show method name

	public static MyBinaryTree<String> constructBT_S_Full_Level3() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree = null;

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_ExpressionQuadratic() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree = null;

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		return tree;
	}

}
