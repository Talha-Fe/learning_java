package cis112_week08.lab;

public class QueueAsLinkedList_Test {

	public static void main(String[] args) {
		QueueAsLinkedList<String> queue = new QueueAsLinkedList<>();

		queue.enqueue("Alice");
		queue.enqueue("Bob");
		queue.enqueue("Cindy");

		System.out.println(queue);
		System.out.println("front: " + queue.peek());
		System.out.println("size: " + queue.size());

		String s;
		s = queue.dequeue();
		System.out.println("dequeued:" + s);
		s = queue.dequeue();
		System.out.println("dequeued:" + s);

		System.out.println(queue);

		queue.enqueue("Donald");
		System.out.println(queue);
	}

}
