package cis112_week08.theory;

public class LinkedListDoublyS_Test {

	public static void main(String[] args) {
		testNode();

		testSearch();
	}

	private static void testSearch() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		LinkedListDoublyS lld;
		lld = LinkedListDoublyS.createLinkedListDoubly(4);
		System.out.println("3:" + LinkedListDoublyS.search("3", lld));
		System.out.println("8:" + LinkedListDoublyS.search("8", lld));
	}

	private static void testNode() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		NodeLLDS a;
		NodeLLDS b;
		NodeLLDS x;

		a = new NodeLLDS("aa");
		System.out.println(a);
		b = new NodeLLDS("bb");
		System.out.println(b);
		x = b;
		System.out.println(x);
		b = a;
		System.out.println(b);
		// linked list
		a.next = x;
		b = new NodeLLDS("cc");
		x.next = b;
	}

}
