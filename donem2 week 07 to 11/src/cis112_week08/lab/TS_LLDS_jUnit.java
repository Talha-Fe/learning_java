package cis112_week08.lab;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis112_week08.theory.LinkedListDoublyS;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Tests for MyQueue.
 * 
 * @author bingol
 */
class TS_LLDS_jUnit {

	/*
	 * jUnit working
	 */

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StudentInfo.studentTag();
		System.out.println("\nYou got one additional point since jUnit is working.");
	}

	@Test
	void lld_null() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		LinkedListDoublyS lld;
		lld = LibLLDS.reverse(null);

		assertEquals(null, lld);
	}

	@Test
	void lld_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		LinkedListDoublyS lld;
		lld = LinkedListDoublyS.createLinkedListDoubly(1);
		lld = LibLLDS.reverse(lld);

		String expected = "[NodeLLDS: data=0] | [NodeLLDS: data=0]";
		String actual = lld.canonical();
		assertEquals(expected, actual);
	}

	@Test
	void lld_2() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		LinkedListDoublyS lld;
		lld = LinkedListDoublyS.createLinkedListDoubly(2);
		lld = LibLLDS.reverse(lld);

		String expected = "[NodeLLDS: data=1][NodeLLDS: data=0] | [NodeLLDS: data=0][NodeLLDS: data=1]";
		String actual = lld.canonical();
		assertEquals(expected, actual);
	}

}
