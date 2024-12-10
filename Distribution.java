package week07.lab;
import java.util.Arrays;

public class Distribution {

	public static void plot(int[] grades, int outOf) {

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		// 0 dan outOf a kadar değer alıyor
		for (int i = 0;  i <= outOf ;i++) {
			
			System.out.print(i + ":");
			
			// yıldız sayısını tutuyo
			int k = 0;
			for(int j = 0; j < grades.length; j++) {
				
				if(grades[j] == i) {

					k++;

				}
				
			}
			
			// yıldızı sayıya göre yazdırıyor
			for(int x = 0; x < k; x++) {
				
				System.out.print("*");
				
			}
		
			System.out.println();
		}				
		

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
