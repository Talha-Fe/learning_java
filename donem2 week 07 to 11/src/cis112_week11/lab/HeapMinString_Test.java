package cis112_week11.lab;

public class HeapMinString_Test {

	private static final boolean DEBUG = true;

	public static void main(String[] args) {

		String[] data = { "ddd", "aaa", "ccc", "bbb" };

		heapMin(data);
	}

	
	private static void heapMin(String[] data) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		HeapMinString minPQ = new HeapMinString(10);
		for (int i = 0; i < data.length; i++) {
			minPQ.enqueue(data[i]);
			if (DEBUG) {
				System.out.println("minPQ=" + minPQ.cononical());
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(minPQ.dequeue());
		}
	}

}
