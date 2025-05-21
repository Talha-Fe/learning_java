package cis112_week08.theory;

/**
 * Doubly linked list of NodeSLLS's
 * 
 * @author bingol
 */
public class LinkedListDoublyS {

	NodeLLDS head = null;

	public LinkedListDoublyS() {
		head = null;
	}

	public LinkedListDoublyS(NodeLLDS head) {
		this.head = head;
	}

	public static LinkedListDoublyS createLinkedListDoubly(int n) {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		NodeLLDS head;
		NodeLLDS current;
		NodeLLDS prev;
		head = new NodeLLDS("0");
		prev = head;
		for (int i = 1; i < n; i++) {
			current = new NodeLLDS("" + i);
			prev.next = current;
			current.prev = prev;
			prev = current;
		}
		LinkedListDoublyS lld = new LinkedListDoublyS(head);
		return lld;
	}

	public String canonical() {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StringBuffer sb = new StringBuffer();

		NodeLLDS x = head; // dll.getHead();
		if (x == null) {
			sb.append("empty list");
			return sb.toString();
		}
		NodeLLDS y = null;
		while (x != null) {
			sb.append(x);
			y = x;
			x = x.next;
		}
		sb.append(" | ");
//		System.out.print(" | ");
		while (y != null) {
			sb.append(y);
			y = y.prev;
		}
		return sb.toString();
	}

	public static boolean search(String str, LinkedListDoublyS lld) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		NodeLLDS current = lld.getHead();
		while (current != null) {
			if (current.data.equals(str)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public String toString() {
		return canonical();
	}

	public NodeLLDS getHead() {
		return head;
	}

	public void setHead(NodeLLDS head) {
		this.head = head;
	}

}
