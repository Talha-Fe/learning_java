package cis112_week10.lab;

public class StudentComparedByGPA extends Student implements Comparable<StudentComparedByGPA> {

	public StudentComparedByGPA(Student student) {
		super(student.getLastName(), student.getName(), student.getGpa());
	}

	public Student getStudent() {
		return (Student) this;
	}

	/*
	 * Return 0 if myGPA is numerically equal to other's GPA; a value less than 0 if
	 * myGPA is numerically less than other's GPA; and a value greater than 0 if
	 * myGPA is numerically greater than other's GPA.
	 */
	@Override
	public int compareTo(StudentComparedByGPA other) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		return Float.compare(this.getGpa(), other.getGpa());

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
