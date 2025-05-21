package cis112_week10.lab;

import cis112_week10.theory.NodeBSTInterface;
import cis112_week10.theory.VisitorInterface;

/**
 * Counts the attendance.
 * 
 * @param <T>
 * @author bingol
 */
public class VisitorAttendance<T> implements VisitorInterface<T> {

	int counter = 0;

	public int getCounter() {
		return counter;
	}

	@Override
	
	public void visit(NodeBSTInterface<T> node) {
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		if(node!=null) {
			counter++;
		}

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

}
