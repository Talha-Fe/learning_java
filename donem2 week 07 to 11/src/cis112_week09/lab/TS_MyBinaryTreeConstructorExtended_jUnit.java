package cis112_week09.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import cis112_week09.theory.MyBinaryTree;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_MyBinaryTreeConstructorExtended_jUnit {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = true;

	@Test
	void constructBT_Full_Level3_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;

		tree = MyBinaryTreeConstructorExtended.constructBT_S_Full_Level3();
		//
		String expected = "/[8]\\[4]/[9]\\[2]/[10]\\[5]/[11]\\[1]/[12]\\[6]/[13]\\[3]/[14]\\[7]/[15]\\";
		String actual = tree.canonical();
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		if (DEBUG2) {
			tree.plot();
		}
		assertEquals(expected, actual);
	}

	@Test
	void constructBT_ExpressionQuadratic_Test() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBinaryTree<String> tree;

		tree = MyBinaryTreeConstructorExtended.constructBT_S_ExpressionQuadratic();
		//
		String expected = "/[b]\\[neg]\\[+]/[b]\\[sq]\\[-]/[4]\\[*]/[a]\\[*]/[c]\\[sqrt]\\[/]/[2]\\[*]/[a]\\";

		String actual = tree.canonical();
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		if (DEBUG2) {
			tree.plot();
		}
		assertEquals(expected, actual);
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
