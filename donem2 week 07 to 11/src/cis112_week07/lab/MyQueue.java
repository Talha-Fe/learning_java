package cis112_week07.lab;

import java.util.NoSuchElementException;

/**
 * A queue implementation.
 * 
 * @param <T>
 * @author bingol
 */
public class MyQueue<T> {

	/**
	 * first node of linked list.
	 */
	MyNode<T> head;
	MyNode<T> tail;
	int size;

	public MyQueue() {
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * Add the node of value as the first node
	 * 
	 * @param value
	 */
	public void enqueue(T data) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		MyNode node = new MyNode(data);
		
		if(isEmpty()) {
			head = node;
			tail = node;
			size++;
		}
		else {
			head.next = node;
			tail = node;
			size++;
		}
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Return the value of the first node and removing it from the list
	 * 
	 * @return
	 */
	public T dequeue() {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		T temp = head.data;
		
		head=head.next;
		if(head==null) {
			tail = null;
		}
		size--;
		
		 return temp; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Return the value of the first node without removing it from the list
	 * 
	 * @return
	 */
	public T peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return head.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		String s = "[MyQueue head=" + head + ", tail=" + tail + ", size=" + size + ", [";
		MyNode<T> node = head;
		if (node != null) {
			s += node;
			node = node.next;
		}
		while (node != null) {
			s += ", " + node;
			node = node.next;
		}
		return s + "]]";
	}

}
