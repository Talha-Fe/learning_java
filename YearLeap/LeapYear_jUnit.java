package week04.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for LeapYear
 * 
 * @author bingol
 */
class LeapYear_jUnit {

	/* **************************************************
	 * not
	 */

	@Test
	void test_1700() {
		boolean expected = false;
		boolean actual = LeapYear.isLeapYear(1700);
		assertEquals(expected, actual);
	}

	@Test
	void test_1800() {
		boolean expected = false;
		boolean actual = LeapYear.isLeapYear(1800);
		assertEquals(expected, actual);
	}

	@Test
	void test_1900() {
		boolean expected = false;
		boolean actual = LeapYear.isLeapYear(1900);
		assertEquals(expected, actual);
	}

	/* **************************************************
	 * leap
	 */

	@Test
	void test_1600() {
		boolean expected = true;
		boolean actual = LeapYear.isLeapYear(1600);
		assertEquals(expected, actual);
	}

	@Test
	void test_2000() {
		boolean expected = true;
		boolean actual = LeapYear.isLeapYear(2000);
		assertEquals(expected, actual);
	}

}
