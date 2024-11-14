package week06.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class FormatInteger_jUnit {

	/*
	 * getNumberOfDigits
	 */

	@Test
	void getNumberOfDigits_m8() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 0;
		int actual = FormatInteger.getNumberOfDigits(-8);
		assertEquals(expected, actual);
	}

	@Test
	void getNumberOfDigits_0() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 0;
		int actual = FormatInteger.getNumberOfDigits(0);
		assertEquals(expected, actual);
	}

	@Test
	void getNumberOfDigits_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 1;
		int actual = FormatInteger.getNumberOfDigits(3);
		assertEquals(expected, actual);
	}

	@Test
	void getNumberOfDigits_12() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 2;
		int actual = FormatInteger.getNumberOfDigits(12);
		assertEquals(expected, actual);
	}

	@Test
	void getNumberOfDigits_123() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 3;
		int actual = FormatInteger.getNumberOfDigits(123);
		assertEquals(expected, actual);
	}

	/*
	 * getNumberOfDigits
	 */

	@Test
	void zeroPadding_345_2() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int number = 345;
		String expected = "" + number;
		String actual = FormatInteger.zeroPadding(number, 2);
		assertEquals(expected, actual);
	}

	@Test
	void zeroPadding_345_3() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int number = 345;
		String expected = "" + number;
		String actual = FormatInteger.zeroPadding(number, 3);
		assertEquals(expected, actual);
	}

	@Test
	void zeroPadding_345_5() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int number = 345;
		String expected = "00" + number;
		String actual = FormatInteger.zeroPadding(number, 5);
		assertEquals(expected, actual);
	}

	/*
	 * separateBlocksWithComma
	 */

	@Test
	void separateBlocksWithComma_321() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String expected = "321";
		String actual = FormatInteger.separateBlocksWithComma(321);
		assertEquals(expected, actual);
	}

	@Test
	void separateBlocksWithComma_4321() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String expected = "4,321";
		String actual = FormatInteger.separateBlocksWithComma(4321);
		assertEquals(expected, actual);
	}

	@Test
	void separateBlocksWithComma_54321() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String expected = "54,321";
		String actual = FormatInteger.separateBlocksWithComma(54321);
		assertEquals(expected, actual);
	}

	@Test
	void separateBlocksWithComma_654321() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String expected = "654,321";
		String actual = FormatInteger.separateBlocksWithComma(654321);
		assertEquals(expected, actual);
	}

	@Test
	void separateBlocksWithComma_7654321() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String expected = "7,654,321";
		String actual = FormatInteger.separateBlocksWithComma(7654321);
		assertEquals(expected, actual);
	}

}
