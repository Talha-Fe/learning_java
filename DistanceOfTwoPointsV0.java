package week03.lab;

import java.util.Scanner;

public class DistanceOfTwoPointsV0 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Reverse Num(1) / Total Digits(2): ");
		
		int userChoice = userInput.nextInt();
		
		if(userChoice == 1) {
			
			System.out.println("Please type a number between 0 and 1000: ");
			int userAnswer = userInput.nextInt();
			
			int b1 = userAnswer % 10;
			int b2 = userAnswer % 100;
			b2 = b2 / 10;
			int b3 = userAnswer / 100;
			
			System.out.println("Result: " + b1 + b2 + b3);
			
		}
		
		else if(userChoice == 2) {
			
			System.out.println("Please type a number between 0 and 1000: ");
			int userAnswer = userInput.nextInt();
			
			int b1 = userAnswer % 10;
			int b2 = userAnswer % 100;
			b2 = b2 / 10;
			int b3 = userAnswer / 100;
			
			System.out.println(b1 + b2 + b3);
			
		}
		
		else {
			
			System.out.println("Error! (Please type 1 or 2 and do not type any other.)");
			
		}
	}

}
