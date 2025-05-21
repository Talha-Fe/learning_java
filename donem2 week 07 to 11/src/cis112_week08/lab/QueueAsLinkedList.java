package cis112_week08.lab;

import cis112_week07.lab.MyNode;

/**
 * Queue implemented as a singly linked list
 * @param <T>
 * @author bingol
 */
public class QueueAsLinkedList<T> {


	private Node<T> front;
	private Node<T> rear;
	private int size;

	/** 
	 * Node as an inner class
	 * 
	 * @param <T>
	 * @author bingol
	 */
	private static class Node<T> {
		
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
		
	}

	public QueueAsLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T item) {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		Node node = new Node(item);
		
		if(isEmpty()) {
			front = node;
			rear = node;
			size++;
		}
		else {
			front.next = node;
			rear = node;
			size++;
		}
		
		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		T temp = front.data;
		
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		size--;
		
		 return temp; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return front.data;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int size() {
		return size;
	}

	public String canonical() {
		StringBuilder sb = new StringBuilder("[Queue:");
		Node<T> current = front;
		while (current != null) {
			sb.append(" " + current.data);
			current = current.next;
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public String toString() {
		return canonical();
	}

}
