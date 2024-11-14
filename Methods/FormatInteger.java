package week06.lab;

//  _              $$\     $$\ $$\       $$\                               
// | |             $$ |    $$ |$$ |      \__|                              
// | |__  _   _  $$$$$$\   $$ |$$$$$$$\  $$\  $$$$$$\   $$$$$$\  $$$$$$$\  
// | '_ \| | | | \_$$  _|  $$ |$$  __$$\ $$ |$$  __$$\ $$  __$$\ $$  __$$\ 
// | |_) | |_| |   $$ |    $$ |$$ |  $$ |$$ |$$ |  \__|$$ /  $$ |$$ |  $$ |
// |_.__/ \__, |   $$ |$$\ $$ |$$ |  $$ |$$ |$$ |      $$ |  $$ |$$ |  $$ |
//         __/ |   \$$$$  |$$ |$$ |  $$ |$$ |$$ |      \$$$$$$  |$$ |  $$ |
//        |___/     \____/ \__|\__|  \__|\__|\__|       \______/ \__|  \__|

public class FormatInteger {

	/**
	 * Calculates the number of digits.
	 * 
	 * @param number
	 * @return number of digits in {@code number}
	 */
	public static int getNumberOfDigits(int number) {
		
		final int BASE_10 = 10;
		
		int digitsNumOf = 0;
		int rest = number;
		while (rest > 0) {
			digitsNumOf++;
			rest = rest / BASE_10;
		}
		return digitsNumOf;
	}

	/**
	 * Zeros are  padded from the left.
	 * 
	 * @param number
	 * @param width
	 * @return
	 */
	public static String zeroPadding(int number, int width) {
		if (number < 0) {
			System.err.println("number < 0");
			return "0";
		}
		String zeroPadded = "";

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V

		if(getNumberOfDigits(number) > width) { zeroPadded += number; }
		else { while(getNumberOfDigits(number) < width) {  zeroPadded += "0"; width--;} zeroPadded += number; }

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
		return zeroPadded;
	}

	/**
	 * Separates 3-digit blocks with ",".
	 * 
	 * @param number
	 * @return
	 */
	public static String separateBlocksWithComma(int number) {

		final int BASE_1000 = 1000;

		String result = "";
		int count = 0;

		if (number < 0) {
			System.err.println("number < 0");
			return "-1";
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		
		String sNumber = Integer.toString(number);
		
		for (int i = getNumberOfDigits(number) - 1; 0 <= i; i--) {
			char eachDigit = sNumber.charAt(i);
			result = eachDigit + result;
			count ++;
			
			if (count % 3 == 0 && count != getNumberOfDigits(number)) {
				result = "," + result;
			}


		}

		
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		return result;
	}

}
