package cis112_week11.lab;

public class HeapMaxString extends HeapCommonString {

	private static final boolean DEBUG = false;
	private static final boolean DEBUG_M = true;

	public HeapMaxString(int capacity) {
		super(capacity);
	}

	// Enqueue an element to the array
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


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Heapify up to maintain heap property
	 */
	private void heapifyUp() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Remove and return the highest-priority element.
	 * 
	 * @return
	 */
	public String dequeue() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		if (size == 0) {
			throw new IllegalStateException("Priority array is empty");
		}
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return "-314"; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	/**
	 * Heapify down to maintain priority order
	 */
	private void heapifyDown() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
