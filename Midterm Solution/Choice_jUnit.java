package grading_2024_3_midterm_1_g1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)

class Choice_jUnit {

	@Test
	void jUnit_working() {
		assertEquals(1, 1);
	}

	@Test
	void max_10_12() {
		int actual = Choice.maxNumber(10, 12);
		int expected = 12;
		assertEquals(actual, expected);
	}

	void max_10_10() {
		int actual = Choice.maxNumber(10, 10);
		int expected = 10;
		assertEquals(actual, expected);
	}

	@Test
	void sumBtwNumbers_1_5() {
		int actual = Choice.sumBtwNumbers(1, 5);
		int expected = 9;
		assertEquals(actual, expected);
	}

	@Test
	void sumBtwNumbers_6_6() {
		int actual = Choice.sumBtwNumbers(6, 6);
		int expected = 0;
		assertEquals(actual, expected);
	}

	@Test
	void cubeNumber_6() {
		int actual = Choice.cubeNumber(6);
		int expected = 216;
		assertEquals(actual, expected);
	}

	@Test
	void cubeNumber_m6() {
		int actual = Choice.cubeNumber(-6);
		int expected = -216;
		assertEquals(actual, expected);
	}

	@Test
	void absoluteValue_m3() {
		int actual = Choice.absoluteValue(-3);
		int expected = 3;
		assertEquals(actual, expected);
	}

	@Test
	void absoluteValue_4() {
		int actual = Choice.absoluteValue(4);
		int expected = 4;
		assertEquals(actual, expected);
	}

	@Test
	void factorial_5() {
		int actual = Choice.factorial(5);
		int expected = 120;
		assertEquals(actual, expected);
	}

	@Test
	void averageThreeNumbers_11_10_13() {
		double actual = Choice.averageThreeNumbers(11, 10, 13);
		double expected = 11.333333333333334;
		assertEquals(actual, expected, 1E-5);
	}

}
