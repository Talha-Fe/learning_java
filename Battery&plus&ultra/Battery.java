package cis111_week10.lab;

public class Battery {

	private double capacity = 0;
	private double remaining = 0;

	public Battery(double capacity) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		this.capacity = capacity;
		this.remaining = capacity;
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public void drain(double amount) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		remaining -= amount;

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public void charge() {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		this.remaining = capacity;
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

	}

	public double getRemainingCapacity() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return remaining; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public String toString() {
		return "[Battery: capacity=" + capacity + ", remaining=" + remaining + "]";
	}

}