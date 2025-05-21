package cis112_week11.bjlo2_ch17;

import java.util.Arrays;

/**
 * This program demonstrates the heapsort algorithm.
 */
public class HeapSorter_Demo {

	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		HeapSorter.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
