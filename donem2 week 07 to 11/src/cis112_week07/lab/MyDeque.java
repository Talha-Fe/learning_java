package cis112_week07.lab;

/**
 * A deque implementation.
 * 
 * @param <T>
 * @author bingol
 */
public class MyDeque<T> implements DequeInterface<T> {

	MyNode<T> first;
	MyNode<T> last;
	int size;

	public MyDeque() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueueFirst(T data) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		MyNode node = new MyNode(data);
		
		if(isEmpty()) {
			
			first = node;
			last = node;
			size++;
		}
		else {
			
			node.next=first;
			first.prev=node;
			first=node;
			size++;
			
		}

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public void enqueueLast(T data) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		MyNode node = new MyNode(data);
		
		if(isEmpty()) {
			
			first = node;
			last = node;
			size++;
		}
		else {
			node.prev=last;
			last.next=node;
			last=node;
			size++;
			
		}

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public T dequeueFirst() {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		T temp = first.data;
		
		first = first.next;
		if(first==null) {
			last=null;
		}
		size--;
		
		 return temp; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public T dequeueLast() {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		T temp = last.data;
		
		last = last.prev;
		if(last==null) {
			first=null;
		}
		size--;
		
		 return temp; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public T peekFirst() {
		return first.data;
	}

	@Override
	public T peekLast() {
		return last.data;
	}

	@Override
	public String toString() {
		String s = "[MyDeque: first=" + first + ", last=" + last + ", size=" + size;
		s += ", " + traverseFirstToLast();
		return s + "]";
	}

	public String traverseFirstToLast() {
		String s = "traverseFirstToLast=[";
		MyNode<T> node = first;
		if (node != null) {
			s += node;
			node = node.next;
		}
		while (node != null) {
			s += ", " + node;
			node = node.next;
		}
		return s + "]";
	}

	public String traverseLastToFirst() {
		String s = "traverseLastToFirst=[";
		MyNode<T> node = last;
		if (node != null) {
			s += node;
			node = node.prev;
		}
		while (node != null) {
			s += ", " + node;
			node = node.prev;
		}
		return s + "]";
	}

}
