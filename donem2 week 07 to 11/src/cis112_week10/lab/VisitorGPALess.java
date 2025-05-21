package cis112_week10.lab;

import cis112_week10.theory.NodeBSTInterface;
import cis112_week10.theory.VisitorInterface;

/**
 * Counts the number of students whose GPA is less than given limit.
 * 
 * For example, given limit of 2.00, it counts the number of students that are
 * below the graduation requirement of minimum 2.00.
 * 
 * @param <T>
 * @author bingol
 */
public class VisitorGPALess<T> implements VisitorInterface<T> {

	int counter = 0;
	float limit = 0F;

	public VisitorGPALess(float limit) {
		this.limit = limit;
	}

	public int getCounter() {
		return counter;
	}

	@Override
	public void visit(NodeBSTInterface<T> node) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		if(node!=null) {
			
			Student s = (Student) node.data();
			if(s.gpa < limit) {
				counter++;
			}
			
		}
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
