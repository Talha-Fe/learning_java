package grading_2024_3_midterm_1_g1;

import java.util.*;

public class Choice {

	public static void main(String args[]) {

		Menu();

		int choice;
		System.out.println("Enter your choice:");
		Scanner input = new Scanner(System.in);
		choice = input.nextInt();
		int number;
		int number2;
		int number3;
		switch (choice) {
		case 1: //DONE
			System.out.println("Enter two numbers");
			number = input.nextInt();
			number2 = input.nextInt();
			System.out.println("Max number:" + maxNumber(number, number2));
			break;
		case 2:
			System.out.println("Enter two numbers:");
			number = input.nextInt();
			number2 = input.nextInt();
			System.out.println("Sum of the numbers btw 2 number:" + sumBtwNumbers(number, number2));
			break;
		case 3: //DONE
			System.out.println("Enter a number:");
			number = input.nextInt();
			System.out.println("Sqaure of the number:" + cubeNumber(number));
			break;
		case 4: //DONE
			System.out.println("Enter a number:");
			number = input.nextInt();
			System.out.println("Absolute of the number:" + absoluteValue(number));
			break;
		case 5:
			System.out.println("Enter a number:");
			number = input.nextInt();
			System.out.println("Factorial of the number:" + factorial(number));
			break;
		case 6: //DONE
			System.out.println("Enter two numbers");
			number = input.nextInt();
			number2 = input.nextInt();
			number3 = input.nextInt();
			System.out.println("Average of the numbers:" + averageThreeNumbers(number, number2, number3));
			break;
		default:
			System.out.println("You must enter a value between 1..6");
		}
		input.close();
	}

	public static void Menu() {

		System.out.println("*********************");
		System.out.println("********MENU*********");
		System.out.println("*********************");
		System.out.println("1. FIND MAX OF TWO NUMBERS");
		System.out.println("2. FIND SUM OF ALL INTEGERS BETWEEN TWO NUMBER");
		System.out.println("3. FIND CUBE OF THE NUMBER");
		System.out.println("4. FIND ABSOLUTE VALUE OF THE NUMBER");
		System.out.println("5. FIND FACTORIAL OF THE NUMBER");
		System.out.println("6. FIND AVERAGE OF THREE NUMBERS");
		System.out.println("*********************");
	}

	public static int maxNumber(int number, int number2) {
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		 return Math.max(number, number2);

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	public static int sumBtwNumbers(int number, int number2) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		int a = 0;
		int result = 0;
		
		for(a = Math.min(number, number2) + 1; a < Math.max(number, number2); a++) 
		{
			
			result += a;
			
		}
		

		 return result;

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public static int cubeNumber(int number) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		int a = 0;
		a = number*number*number;
		
		 return a;

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public static int absoluteValue(int number) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		
		 return Math.abs(number);

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public static int factorial(int number) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		int j;
		int numberTwo = 1;
		
        for(j = 1; j <= number; j++)           /**/
        {
            numberTwo = numberTwo * j;
        }
		
		 return numberTwo;

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

	public static double averageThreeNumbers(int number, int number2, int number3) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		double a = 0;
		
		a = (number + number2 + number3) / 3.0;
		
		 return a;

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
