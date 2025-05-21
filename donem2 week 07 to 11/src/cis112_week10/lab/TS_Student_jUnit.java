package cis112_week10.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



import cis112_week10.theory.MyBST;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_Student_jUnit {

	private static final boolean DEBUG = true;

//	MyBST<StudentComparedByGPA> bstByGPA;
	MyBST<StudentComparedByName> bstByName;
	MyBST<StudentComparedByGPA> bstByGPA;

	@BeforeEach
	void prep() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

//		bstByGPA = populateBST();
		bstByGPA = populateBSTByGPA();
		bstByName = populateBSTByName();

	}

	@Test
	void s_Comparable_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StudentComparedByGPA studentA = new StudentComparedByGPA(new Student("aaa", "aaaa", 2.08f));
		StudentComparedByGPA studentB = new StudentComparedByGPA(new Student("bbb", "bbbb", 2.18f));

		boolean expected = true;
		boolean actual = studentA.compareTo(studentB) < 0;
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void s_VisitorPrintShort_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorPrintShort<StudentComparedByName> visitor = new VisitorPrintShort<>();
		bstByName.traverseInOrder(visitor);

		String expected = ", aaab, aaca, abdd, babb, babc, bbcc, cdab, cdbd, dabc";
		String actual = visitor.getLastNames();
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void s_VisitorAttendance_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorAttendance<StudentComparedByGPA> visitor = new VisitorAttendance<>();
		bstByGPA.traverseInOrder(visitor);

		int expected = 9;
		int actual = visitor.getCounter();
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void s_VisitorGPALess_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorGPALess<StudentComparedByGPA> visitor = new VisitorGPALess<>(2.0f);
		bstByGPA.traverseInOrder(visitor);

		int expected = 3;
		int actual = visitor.getCounter();
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual);
	}

	@Test
	void s_VisitorGPAAverage_01() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorGPAAverage<StudentComparedByGPA> visitor = new VisitorGPAAverage<>();
		bstByGPA.traverseInOrder(visitor);

		float expected = 2.38f;
		float actual = visitor.getAverage();
		if (DEBUG) {
			System.out.println("actual:" + actual);
		}
		assertEquals(expected, actual, 1e-2);
	}

	/*
	 * ================================================== utilities
	 */

	private Student[] populateStudent() {
		Student[] arrStudent = new Student[9];
		arrStudent[0] = new Student("dabc", "ddc", 3.01f);
		arrStudent[1] = new Student("bbcc", "caa", 3.91f);
		arrStudent[2] = new Student("babb", "adc", 2.08f);
		arrStudent[3] = new Student("aaca", "dbd", 3.51f);
		arrStudent[4] = new Student("cdbd", "ccb", 2.72f);
		arrStudent[5] = new Student("cdab", "dab", 1.92f);
		arrStudent[6] = new Student("aaab", "adb", 1.32f);
		arrStudent[7] = new Student("babc", "dcb", 0.86f);
		arrStudent[8] = new Student("abdd", "acd", 2.07f);
		return arrStudent;
	}

	private MyBST<StudentComparedByGPA> populateBSTByGPA() {
		Student[] arrStudent = populateStudent();
		MyBST<StudentComparedByGPA> bstByGPA = Student_Test.populateBSTByGPA(arrStudent);
		return bstByGPA;
	}
	private MyBST<StudentComparedByName> populateBSTByName() {
		Student[] arrStudent = populateStudent();
		MyBST<StudentComparedByName> bstByName = Student_Test.populateBSTByName(arrStudent);
		return bstByName;
	}

	/*
	 * jUnit working
	 */

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());


		System.out.println("\nYou got one additional point since jUnit is working.");
	}

}
