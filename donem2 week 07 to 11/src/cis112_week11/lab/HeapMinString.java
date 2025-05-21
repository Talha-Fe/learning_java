package cis112_week11.lab;

public class HeapMinString extends HeapCommonString {

	private static final boolean DEBUG = false;
	private static final boolean DEBUG_M = true;

	public HeapMinString(int capacity) {
		super(capacity);
	}

	public void enqueue(String element) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		if (size == capacity) {
			expandCapacity();
		}
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		array[size] = element;
		heapifyUp(size);
		size++;
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Restore the heap property by moving the element at index up
	 * 
	 * @param index
	 */
	private void heapifyUp(int index) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		while (index > 0) {
			int parentIndex = (index - 1) / 2;
			if (array[index].compareTo(array[parentIndex]) < 0) {
				// swap
				String temp = array[index];
				array[index] = array[parentIndex];
				array[parentIndex] = temp;
				index = parentIndex;
			} else {
				break;
			}
		}

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	// Remove and return the smallest element (highest priority)
	public String dequeue() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		if (size == 0) {
			throw new IllegalStateException("Priority queue is empty");
		}
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		String min = array[0];
		array[0] = array[size - 1];
		size--;
		heapifyDown(0);
		return min; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	// Restore the array property by moving the element at index down
	private void heapifyDown(int index) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		while (index < size) {
			int leftChild = 2 * index + 1;
			int rightChild = 2 * index + 2;
			int smallest = index;

			if (leftChild < size && array[leftChild].compareTo(array[smallest]) < 0) {
				smallest = leftChild;
			}
			if (rightChild < size && array[rightChild].compareTo(array[smallest]) < 0) {
				smallest = rightChild;
			}

			if (smallest != index) {
				String temp = array[index];
				array[index] = array[smallest];
				array[smallest] = temp;
				index = smallest;
			} else {
				break;
			}
		}

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
