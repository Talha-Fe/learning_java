package cis112_week11.lab;

import java.util.Arrays;

public class HeapCommonString {

	String[] array; // Array to hold elements
	int size; // Number of elements in the heap
	int capacity; // Capacity of the heap

	public HeapCommonString(int capacity) {
		this.capacity = capacity;
		this.array = new String[capacity];
		this.size = 0;
	}

	/**
	 * Peek at the highest-priority element.
	 * 
	 * @return
	 */
	public String peek() {
		if (size == 0) {
			throw new IllegalStateException("Priority array is empty");
		}
		return array[0];
	}

	/**
	 * Check if the array is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Get the size of the array
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Expand capacity when the array is full
	 */
	public void expandCapacity() {
		capacity *= 2;
		array = Arrays.copyOf(array, capacity);
	}

	/**
	 * Swap two elements in the array.
	 * 
	 * @param i
	 * @param j
	 */
	void swap(int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public String cononical() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sb.append(", ");
			sb.append(array[i]);
		}
		return sb.toString();
	}
}
