package cis112_week11.lab;

public class HeapMaxString_Test {

	private static final boolean DEBUG = true;

	public static void main(String[] args) {

		String[] data = { "ddd", "aaa", "ccc", "bbb" };

		heapMax(data);
	}

	private static void heapMax(String[] data) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		HeapMaxString maxPQ = new HeapMaxString(data.length + 2);
		for (int i = 0; i < data.length; i++) {
			maxPQ.enqueue(data[i]);
			if (DEBUG) {
				System.out.println("en maxPQ=" + maxPQ.cononical());
			}
		}

		for (int i = 0; i < data.length; i++) {
			System.out.println("de maxPQ=" + maxPQ.cononical() + "\telement=" + maxPQ.dequeue());
		}
	}

}
