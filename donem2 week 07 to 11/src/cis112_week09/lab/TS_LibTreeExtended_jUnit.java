package cis112_week09.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



import cis112_week09.theory.MyBinaryTree;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_LibTreeExtended_jUnit {

	private static final boolean DEBUG = true;

	/*
	 * size
	 */

	@Test
	void size_constructBT_empty_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<Integer> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_I_empty();
		//
		int expected = 0;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_t_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t();
		//
		int expected = 1;
		int actual = LibTreeExtended.size(tree.getRoot());
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_t_l_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t_l();
		//
		int expected = 2;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_t_r_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t_r();
		//
		int expected = 2;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_t_lr_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t_lr();
		//
		int expected = 3;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_t_lr_ll_llr_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t_lr_ll_llr();
		//
		int expected = 5;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_1_2_3_5_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<Integer> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_I_1_2_3_5();
		//
		int expected = 4;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_1_6_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_1_6();
		//
		int expected = 6;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_Expression_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_Expression();
		//
		int expected = 7;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void size_constructBT_Full_Level3_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_Full_Level3();
		//
		int expected = 15;
		int actual = LibTreeExtended.size(tree.getRoot());
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	/*
	 * find
	 */

	@Test
	void find_constructBT_empty_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<Integer> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_I_empty();
		//
		boolean expected = false;
		{
			boolean actual = LibTreeExtended.find(tree, 2);
			assertEquals(expected, actual);
		}
	}

	@Test
	void find_constructBT_t_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t();
		//
		boolean expected;
		boolean actual;
		//
		expected = false;
		{
			actual = LibTreeExtended.find(tree, "9");
			assertEquals(expected, actual);
		}
		//
		expected = true;
		{
			//
			actual = LibTreeExtended.find(tree, "t");
			assertEquals(expected, actual);
		}
	}

	@Test
	void find_constructBT_t_l_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t_l();
		//
		boolean expected;
		boolean actual;
		//
		expected = false;
		{
			//
			actual = LibTreeExtended.find(tree, "9");
			if (DEBUG) {
				System.out.println("actual:" + actual);
			}
			assertEquals(expected, actual);
			//
			actual = LibTreeExtended.find(tree, "r");
			if (DEBUG) {
				System.out.println("actual:" + actual);
			}
			assertEquals(expected, actual);
		}
		//
		expected = true;
		{
			//
			actual = LibTreeExtended.find(tree, "t");
			assertEquals(expected, actual);
			//
			actual = LibTreeExtended.find(tree, "l");
			assertEquals(expected, actual);
		}
		//
	}

	@Test
	void find_constructBT_t_r_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_t_r();
		//
		boolean expected;
		boolean actual;
		//
		expected = false;
		{
			//
			actual = LibTreeExtended.find(tree, "9");
			assertEquals(expected, actual);
			//
			actual = LibTreeExtended.find(tree, "l");
			assertEquals(expected, actual);
		}
		//
		expected = true;
		{
			//
			actual = LibTreeExtended.find(tree, "t");
			assertEquals(expected, actual);
			//
			actual = LibTreeExtended.find(tree, "r");
			assertEquals(expected, actual);
		}

	}

	@Test
	void find_constructBT_1_6_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_1_6();
		//
		boolean expected;
		boolean actual;
		//
		expected = false;
		{
			//
			actual = LibTreeExtended.find(tree, "9");
			assertEquals(expected, actual);
		}
		//
		expected = true;
		{
			//
			actual = LibTreeExtended.find(tree, "2");
			assertEquals(expected, actual);
		}
	}

	@Test
	void find_constructBT_Full_Level3_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_Full_Level3();
		//
		// short form
		assertEquals(false, LibTreeExtended.find(tree, "0"));
		assertEquals(false, LibTreeExtended.find(tree, "20"));
		//
		assertEquals(true, LibTreeExtended.find(tree, "1"));
		assertEquals(true, LibTreeExtended.find(tree, "5"));
	}

	@Test
	void find_constructBT_ExpressionQuadratic_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;
		tree = MyBinaryTreeConstructorExtended.constructBT_S_ExpressionQuadratic();
		if (DEBUG) {
			System.out.println("canonical:" + tree.canonical());
		}
		//
		// short form
		assertEquals(false, LibTreeExtended.find(tree, "0"));
		assertEquals(false, LibTreeExtended.find(tree, "20"));
		//
		assertEquals(true, LibTreeExtended.find(tree, "a"));
		assertEquals(true, LibTreeExtended.find(tree, "b"));
		assertEquals(true, LibTreeExtended.find(tree, "c"));
		assertEquals(true, LibTreeExtended.find(tree, "2"));
		assertEquals(true, LibTreeExtended.find(tree, "4"));
		assertEquals(true, LibTreeExtended.find(tree, "neg"));
		assertEquals(true, LibTreeExtended.find(tree, "sq"));
		assertEquals(true, LibTreeExtended.find(tree, "sqrt"));
		assertEquals(true, LibTreeExtended.find(tree, "+"));
		assertEquals(true, LibTreeExtended.find(tree, "-"));
		assertEquals(true, LibTreeExtended.find(tree, "*"));
		assertEquals(true, LibTreeExtended.find(tree, "/"));
	}

	/*
	 * ================================================== utilities
	 */

	/*
	 * jUnit working
	 */

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		System.out.println("\nYou got one additional point since jUnit is working.");
	}

}
