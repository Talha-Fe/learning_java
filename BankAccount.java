package cis111_2024_3_project_2_g1;

public class BankAccount {

	static final double LEVEL_100K = 100000;
	static final double LEVEL_10K = 10000;
	static final double BONUS_100K = 0.01;
	static final double BONUS_10K = 0.005;

	public String accountNumber;
	public String accountHolder;
	public double balance;

	public BankAccount() {

	}

	public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO(2) your code should be between below and above marks.

		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

	}

	public void deposit(double amount) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO(3) your code should be between below and above marks.
			
		
		if(amount >= 0) {
			
			if(amount < LEVEL_10K) {
				 
				balance += amount;
				 
			 }
			 else if(amount <= LEVEL_100K) {
				 
				 balance += amount + (amount*BONUS_10K);
				 
			 }
			 else {
				 
				 balance += amount + (amount*BONUS_100K);
				 
			 }
			
		}
		

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public void withdraw(double amount) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO(4) your code should be between below and above marks.

		if(amount > 0 && amount <= balance ) {
			
			 balance -= amount;

		}
		else { //ERROR
			
			
		}

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public String toString() {
		return "[BankAccount: accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}

}
