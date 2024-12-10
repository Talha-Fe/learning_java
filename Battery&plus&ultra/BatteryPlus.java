package cis111_week10.lab;

public class BatteryPlus {

	public static final double PERCENT_90 = .9;

	private double capacity = 0;
	private double remaining = 0;

	public BatteryPlus(double capacity) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		this.capacity = capacity*PERCENT_90;
		this.remaining = this.capacity;
		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public void drain(double amount) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		if(remaining < 0) {
			remaining = 0;
		}
		else {
			remaining -= amount;
		}

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public void charge() {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		remaining = capacity;

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

	}

	public double getRemainingCapacity() {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return remaining; 

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public String toString() {
		return "[BatteryPlus: capacity=" + capacity + ", remaining=" + remaining + "]";
	}

}
