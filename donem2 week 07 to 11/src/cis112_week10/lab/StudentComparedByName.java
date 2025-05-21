package cis112_week10.lab;

public class StudentComparedByName extends Student implements Comparable<StudentComparedByName> {

	public StudentComparedByName(Student student) {
		super(student.getLastName(), student.getName(), student.getGpa());
	}

	public Student getStudent() {
		return (Student) this;
	}

	@Override
	public int compareTo(StudentComparedByName other) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return lastName.compareTo(other.lastName); // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
