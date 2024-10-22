package week04.lab;

/**
 * Leap year
 * 
 * @author bingol
 */
public class LeapYear {

	public static boolean isLeapYear(int year) {
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			
			System.out.println("This year is leap year!");
			
			return true;
			
		}
		
		else {
			
			System.out.println("This year is NOT leap year!");
			
			return false;
			
		}
		
	}

}
