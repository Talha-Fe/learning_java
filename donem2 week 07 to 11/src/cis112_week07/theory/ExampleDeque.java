package cis112_week07.theory;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleDeque {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		int x;

		deque.addFirst(1);
		System.out.println("deque 1:" + deque);

		deque.addLast(2);
		System.out.println("deque 2:" + deque);

		deque.addFirst(3);
		System.out.println("deque 3:" + deque);

		x = deque.removeFirst();
		System.out.println("deque 4:" + deque + ", x:" + x);

		x = deque.removeLast();
		System.out.println("deque 5:" + deque + ", x:" + x);
	}

}
