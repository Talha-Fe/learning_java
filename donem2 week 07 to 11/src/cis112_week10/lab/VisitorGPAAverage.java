package cis112_week10.lab;

import cis112_week10.theory.NodeBSTInterface;
import cis112_week10.theory.VisitorInterface;

/**
 * Calculates the average of GPAs in the tree of Students.
 * 
 * @param <T>
 * @author bingol
 */
public class VisitorGPAAverage<T> implements VisitorInterface<T> {

	float sum = 0;
	int counter = 0;

	public float getAverage() {
		if (counter == 0) {
			return 0;
		}
		return sum / counter;
	}

	@Override

	public void visit(NodeBSTInterface<T> node) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		
		if(node!=null) {
			
			Student s = (Student) node.data();
			sum += s.gpa;
			counter++;
			
		}
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
