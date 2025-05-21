package cis112_week07.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Tests for MyDeque.
 * 
 * @author bingol
 */
class TS_MyDeque_jUnit {

	/*
	 * jUnit working
	 */

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StudentInfo.studentTag();
		System.out.println("\nYou got one additional point since jUnit is working.");
	}

	@Test
	void constractor() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		/**/System.out.println("constractor:" + deque);
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
		//
		assertEquals(true, deque.isEmpty());
	}

	@Test
	void ef() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);
		//
		String expected = "[MyDeque: first=[NodeS: value=a], last=[NodeS: value=a], size=1, traverseFirstToLast=[[NodeS: value=a]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void ef_df() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);

		x = deque.dequeueFirst();
		/**/System.out.println("df:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void ef_dl() {
		System.out.println("\n" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);

		x = deque.dequeueLast();
		/**/System.out.println("df:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void ef_ef() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		/**/System.out.println("ef:" + deque);

		deque.enqueueFirst("b");
		/**/System.out.println("ef:" + deque);
		//
		String expected = "[MyDeque: first=[NodeS: value=b], last=[NodeS: value=a], size=2, traverseFirstToLast=[[NodeS: value=b], [NodeS: value=a]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);
		//
		String expected = "[MyDeque: first=[NodeS: value=a], last=[NodeS: value=a], size=1, traverseFirstToLast=[[NodeS: value=a]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_df() {
		System.out.println("\n" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		x = deque.dequeueFirst();
		/**/System.out.println("df:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_dl() {
		System.out.println("\n" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		x = deque.dequeueLast();
		/**/System.out.println("dl:" + deque + ", x=" + x);
		/**/System.out.println("isEmpty:" + deque.isEmpty());
		//
		String expected = "[MyDeque: first=null, last=null, size=0, traverseFirstToLast=[]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_el() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		deque.enqueueLast("b");
		/**/System.out.println("el:" + deque);
		//
		String expected = "[MyDeque: first=[NodeS: value=a], last=[NodeS: value=b], size=2, traverseFirstToLast=[[NodeS: value=a], [NodeS: value=b]]]";
		String actual = deque.toString();
		assertEquals(expected, actual);
	}

	@Test
	void el_el_el() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueLast("a");
		/**/System.out.println("el:" + deque);

		deque.enqueueLast("b");
		/**/System.out.println("el:" + deque);

		deque.enqueueLast("c");
		/**/System.out.println("el:" + deque);

		/**/System.out.println("tfl:" + deque.traverseFirstToLast());
		/**/System.out.println("tlf:" + deque.traverseLastToFirst());
		//
		String expected;
		String actual;
		expected = "traverseFirstToLast=[[NodeS: value=a], [NodeS: value=b], [NodeS: value=c]]";
		actual = deque.traverseFirstToLast();
		assertEquals(expected, actual);
		//
		expected = "traverseLastToFirst=[[NodeS: value=c], [NodeS: value=b], [NodeS: value=a]]";
		actual = deque.traverseLastToFirst();
		assertEquals(expected, actual);
	}

	@Test
	void pf_pl() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String x;
		MyDeque<String> deque = new MyDeque<>();

		deque.enqueueFirst("a");
		deque.enqueueFirst("b");
		/**/System.out.println(deque);
		/**/System.out.println("pf:" + deque.peekFirst());
		/**/System.out.println("pl:" + deque.peekLast());

		//
		String expected;
		String actual;
		expected = "b";
		actual = deque.peekFirst();
		assertEquals(expected, actual);
		//
		expected = "a";
		actual = deque.peekLast();
		assertEquals(expected, actual);
	}

}
