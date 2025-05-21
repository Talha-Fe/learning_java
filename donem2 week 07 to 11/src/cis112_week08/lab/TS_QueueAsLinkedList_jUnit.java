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
class TS_QueueAsLinkedList_jUnit {

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
	void queue_e() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		QueueAsLinkedList<String> queue = new QueueAsLinkedList<>();
		queue.enqueue("Alice");

		String expected = "[Queue: Alice]";
		String actual = queue.canonical();
		System.out.println("expected:" + expected);
		System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	@Test
	void queue_ed() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		QueueAsLinkedList<String> queue = new QueueAsLinkedList<>();
		queue.enqueue("Alice");
		queue.dequeue();

		String expected = "[Queue:]";
		String actual = queue.canonical();
		System.out.println("expected:" + expected);
		System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	@Test
	void queue_edee() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		QueueAsLinkedList<String> queue = new QueueAsLinkedList<>();
		queue.enqueue("Alice");
		queue.dequeue();
		queue.enqueue("Bob");
		queue.enqueue("Cindy");

		String expected = "[Queue: Bob Cindy]";
		String actual = queue.canonical();
		System.out.println("expected:" + expected);
		System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	@Test
	void queue_edee_int() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		QueueAsLinkedList<Integer> queue = new QueueAsLinkedList<>();
		queue.enqueue(111);
		queue.dequeue();
		queue.enqueue(222);
		queue.enqueue(333);

		String expected = "[Queue: 222 333]";
		String actual = queue.canonical();
		System.out.println("expected:" + expected);
		System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

}
