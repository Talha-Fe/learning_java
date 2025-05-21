package cis112_week10.lab;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LibWeek {

	public static String generateString(int length) {
		final String[] LETTERS = { "a", "b", "c", "d" };
		String str = "";
		for (int i = 0; i < length; i++) {
			int index = (int) (LETTERS.length * Math.random());
			str += LETTERS[index];
		}
		return str;
	}

	public static double generateRandom(double low, double range) {
		// low <= d < low + range
		return range * Math.random() + low;
	}

	public static double rounding(double value, int places) {
		// https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
		if (places < 0) {
			throw new IllegalArgumentException();
		}
		BigDecimal bd = BigDecimal.valueOf(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}
