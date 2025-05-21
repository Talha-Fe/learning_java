package cis112_week07.lab;

public interface DequeInterface<T> {

	boolean isEmpty();

	void enqueueFirst(T object);

	void enqueueLast(T object);

	T dequeueFirst();

	T dequeueLast();

	T peekFirst();

	T peekLast();

}
