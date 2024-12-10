package cis111_week10.lab;

/**
 * 
 * 
 * @author bingol
 */
public class BatteryUltra {

	public static final double PERCENT_90 = .9;
	public static final double PERCENT_70 = .7;
	public static final double PERCENT_20 = .2;

	public static enum LampState {
		ON, OFF
	}

	private LampState lampHigh = LampState.ON;
	private LampState lampCharge = LampState.ON;
	
	private double capacity = 0;
	private double remaining = 0;

	public BatteryUltra(double capacity) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		this.capacity = capacity * PERCENT_90;
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

		 return remaining; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public String toString() {
		return "[BatteryBetter: lampHigh=" + lampHigh + ", lampCharge=" + lampCharge + ", capacity=" + capacity
				+ ", remaining=" + remaining + "]";
	}

	public LampState getLampHigh() {
		
		if(remaining > 70) {
			lampHigh = LampState.ON;
		}
		else {
			lampHigh = LampState.OFF;
		}
		
		return lampHigh;
	}

	public LampState getLampCharge() {
		
		if(remaining < 20) {
			lampCharge = LampState.ON;
		}
		if(remaining == 0) {
			lampCharge = LampState.OFF;
		}
		if(remaining >= 20) {
			lampCharge = LampState.OFF;
		}
		
		return lampCharge;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getRemaining() {
		return remaining;
	}

}
