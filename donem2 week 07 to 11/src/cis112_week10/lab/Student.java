package cis112_week10.lab;

public class Student {

	String lastName;
	String name;
	float gpa;

	public Student(String lastName, String name, float gpa) {
		this.lastName = lastName;
		this.name = name;
		this.gpa = gpa;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return name;
	}

	public float getGpa() {
		return gpa;
	}

	public static Student generateStudent() {
		String lastName = LibWeek.generateString(4);
		String name = LibWeek.generateString(3);
		double d = LibWeek.generateRandom(0, 4);
		float gpa = (float) LibWeek.rounding(d, 2);
		return new Student(lastName, name, gpa);
	}

	@Override
	public String toString() {
		return "[Student lastName=" + lastName + ", name=" + name + ", gpa=" + gpa + "]";
	}

}
