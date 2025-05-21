package cis112_week10.lab;

import cis112_week10.theory.MyBST;

/**
 * 
 * 
 * @author bingol
 */
public class Student_Test {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = true;

	public static void main(String[] args) {
		MyBST<StudentComparedByName> bstByName;
		MyBST<StudentComparedByGPA> bstByGPA;
		VisitorGPAAverage<StudentComparedByGPA> gpaAverage = new VisitorGPAAverage<>();
		Student[] arrStudent;

		arrStudent = getArrayStudent(9);
		bstByGPA = populateBSTByGPA(arrStudent);
		bstByName = populateBSTByName(arrStudent);

//		// sort by GPA
//		bstByGPA.plot();
//		printByGPA(bstByGPA);

//		// sort by name
//		bstByName.plot();
//		printByName(bstByName);

//		// attendance
//		attendance(bstByGPA);

//		// gpaLess
//		gpaLess(bstByGPA, 2.00f);

//		// average
//		average(bstByGPA);
	}

	/**
	 * Generates {@code studentNO} students.
	 * 
	 * @param studentNO number of students.
	 * @return array of Students.
	 */
	public static Student[] getArrayStudent(int studentNO) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		Student[] arrStudent;
		arrStudent = new Student[studentNO];
		for (int i = 0; i < arrStudent.length; i++) {
			Student student = Student.generateStudent();
			arrStudent[i] = student;
			if (DEBUG) {
				System.out.println(student);
			}
		}
		return arrStudent;
	}

	/**
	 * Populates a BST with students.
	 * 
	 * @param arrStudent student array
	 * @return BST of students.
	 */
	public static MyBST<StudentComparedByGPA> populateBSTByGPA(Student[] arrStudent) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBST<StudentComparedByGPA> tree = new MyBST<>();
		StudentComparedByGPA studentByGPA;
		for (int i = 0; i < arrStudent.length; i++) {
			studentByGPA = new StudentComparedByGPA(arrStudent[i]);
			tree.insert(studentByGPA);
		}
		return tree;
	}

	/**
	 * Populates a BST with students.
	 * 
	 * @param arrStudent student array
	 * @return BST of students.
	 */
	public static MyBST<StudentComparedByName> populateBSTByName(Student[] arrStudent) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		MyBST<StudentComparedByName> tree = new MyBST<>();
		StudentComparedByName studentByName;
		for (int i = 0; i < arrStudent.length; i++) {
			studentByName = new StudentComparedByName(arrStudent[i]);
			tree.insert(studentByName);
		}
		return tree;
	}

	/**
	 * Print students in ascending order in GPA.
	 * 
	 * @param bstByGPA
	 */
	public static void printByGPA(MyBST<StudentComparedByGPA> bstByGPA) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorPrintShort<StudentComparedByGPA> visitor = new VisitorPrintShort<>();
		bstByGPA.traverseInOrder(visitor);
	}

	/**
	 * Print students ordered in name.
	 * 
	 * @param bstByName
	 */
	private static void printByName(MyBST<StudentComparedByName> bstByName) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorPrintShort<StudentComparedByName> visitor = new VisitorPrintShort<>();
		bstByName.traverseInOrder(visitor);
	}

	/**
	 * Get the attendance number.
	 * 
	 * @param bstByGPA
	 */
	private static void attendance(MyBST<StudentComparedByGPA> bstByGPA) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorAttendance<StudentComparedByGPA> visitor = new VisitorAttendance<>();
		bstByGPA.traverseInOrder(visitor);
		System.out.printf("There are %d students attend the lecture.\n", visitor.getCounter());
	}

	/**
	 * Get the number of students with GPA less than a given limit.
	 * 
	 * @param bstByGPA
	 * @param limit
	 */
	private static void gpaLess(MyBST<StudentComparedByGPA> bstByGPA, float limit) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorGPALess<StudentComparedByGPA> visitor = new VisitorGPALess<StudentComparedByGPA>(limit);
		bstByGPA.traverseInOrder(visitor);
		System.out.printf("There are %d students with GPA less than %.2f.\n", visitor.getCounter(), limit);
	}

	/**
	 * Get the average of GPAs.
	 * 
	 * @param bstByGPA
	 */
	private static void average(MyBST<StudentComparedByGPA> bstByGPA) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		VisitorGPAAverage<StudentComparedByGPA> visitor = new VisitorGPAAverage<>();
		bstByGPA.traverseInOrder(visitor);
		System.out.printf("The average of GPAs is %.2f.\n", visitor.getAverage());
	}

}
