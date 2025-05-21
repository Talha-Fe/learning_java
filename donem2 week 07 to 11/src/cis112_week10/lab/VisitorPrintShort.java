package cis112_week10.lab;

import cis112_week10.theory.NodeBSTInterface;
import cis112_week10.theory.VisitorInterface;

/**
 * Prints the info of the Student.
 * 
 * @param <T>
 * @author bingol
 */
public class VisitorPrintShort<T> implements VisitorInterface<T> {

	StringBuffer lastNames = new StringBuffer();

	@Override
	public void visit(NodeBSTInterface<T> node) {
		Student student = (Student) node.data();
		System.out.printf("l=%s n=%s g=%4.2f\n" //
				, student.getLastName() //
				, student.getName() //
				, student.getGpa() //
		);

		lastNames.append(", " + student.getLastName());
	}

	public String getLastNames() {
		return lastNames.toString();
	}
}
