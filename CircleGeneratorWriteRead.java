package week08.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.crypto.Data;

import week08.theory.*;

import hblib.io.svg.*;

//   __  .__  .__    .__                      
// _/  |_|  | |  |__ |__|______  ____   ____  
// \   __\  | |  |  \|  \_  __ \/  _ \ /    \ 
//  |  | |  |_|   Y  \  ||  | \(  <_> )   |  \
//  |__| |____/___|  /__||__|   \____/|___|  /
//                 \/                      \/ 

/**
 * Write to a file, then read it.
 * 
 * @author bingol
 */
public class CircleGeneratorWriteRead {

	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = false;

	private static final int INDEX_X = 0;
	private static final int INDEX_Y = 1;
	private static final int INDEX_R = 2;

	private static final String COMMA = ",";
	private static final String NEW_LINE = "\n";

	// define file
	private static final String PATH_TO_DIRECTORY = "_generated" //
			+ File.separator + "week08" //
			+ File.separator //
	;
	private static final String fileName = "CircleGeneratorWriteRead";
	private static final String PATH_TO_FILE_NAME = PATH_TO_DIRECTORY + fileName;
	private static final String PATH_TO_FILE_CSV = PATH_TO_FILE_NAME + ".csv";

	/**
	 * Number of columns.
	 */
	public static final int COLUMN_NO = 3;

	public static void main(String[] args) throws FileNotFoundException {
		//
		final int circleNumberOf = 4;
		//
		int[][] dataGenerated = patternGenerator(circleNumberOf);

		visualize(dataGenerated);
		//
		csvWrite(dataGenerated);
		print2DArray("dataGenerated", dataGenerated);

		// read
		int[][] dataRead = csvRead(circleNumberOf);
		print2DArray("dataRead", dataRead);
	}

	/**
	 * Write data to a file in CSV format.
	 * 
	 * @param data
	 * @throws FileNotFoundException 
	 */
	private static void csvWrite(int[][] data) throws FileNotFoundException {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 PrintWriter inputFile = new PrintWriter(PATH_TO_FILE_CSV);
		 
		 inputFile.println("X,Y,Z");
		 
		 for(int i = 0; i < data.length; i++) {
			 
			 inputFile.printf("%d,%d,%d\n", data[i][0], data[i][1], data[i][2]);
			 
		 }
		 
		 inputFile.close();
		 
		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		System.out.println("~~~~written: " + PATH_TO_FILE_CSV);
		System.out.println("-<" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
	}

	/**
	 * Read {@code Circle} parameters from csv file at {@code pathToCsv}. Return the
	 * parameters in 2D array where each row corresponds to parameters of a
	 * {@code Circle}.
	 * 
	 * @param pathToCsv
	 * @param circleNO  Number of circles
	 * @return
	 * @throws FileNotFoundException 
	 */
	private static int[][] csvRead(int circleNO) throws FileNotFoundException {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int[][] arr2D = new int[circleNO][CircleGeneratorWriteRead.COLUMN_NO];

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		File x = new File(PATH_TO_FILE_CSV);
		Scanner a = new Scanner(x);
		a.nextLine();
		
		while(a.hasNextLine()) {
			for(int j = 0; j < circleNO; j++) {
				String k = a.nextLine();
				String[] value = k.split(COMMA);				
				for(int am = 0; am < 3; am++) {					
					arr2D[j][am] = Integer.parseInt(value[am]);	// CHATGPT MADE THIS PART
				}
			}
		}

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		System.out.println("~~~~read: " + PATH_TO_FILE_CSV);
		System.out.println("-<" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		return arr2D;
	}

	/**
	 * Creates a pattern of circles.
	 * 
	 * @param circleNumberOf
	 * @return 2D array, where row i has x and y of center and radius of circle i.
	 */
	private static int[][] patternGenerator(int circleNumberOf) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		final int X_0 = 50; // x of the center of the first circle
		final int Y_0 = 50; // y of the center of the first circle
		final int RADIUS = 20; // radius
		//
		final int DELTA_X = 10;
		final int DELTA_Y = 40;

		// int[][] arr = new int[circleNumberOf][3];
		int[][] arr = new int[circleNumberOf][COLUMN_NO]; // better
		for (int i = 0; i < circleNumberOf; i++) {
			// arr[i][0] = X_0 + DELTA_X * i;
			arr[i][INDEX_X] = X_0 + DELTA_X * i; // better
			arr[i][INDEX_Y] = Y_0 + DELTA_Y * i;
			arr[i][INDEX_R] = RADIUS;
		}
		System.out.println("-<" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		return arr;
	}

	/**
	 * Visualize the data.
	 * 
	 * @param data 2D array, where row i has x and y of center and radius of circle
	 *             i.
	 */
	private static void visualize(int[][] data) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		Paper paper = new Paper(0, 0, 600, 300);

		//
		Circle circle = null;
		for (int i = 0; i < data.length; i++) {
			circle = new Circle(data[i][0], data[i][1], data[i][2]);
			circle.setColorFill(SVGLib.COLOR_CONIFER);
			circle.setColorStroke(SVGLib.COLOR_BLACK);
			circle.setStrokeWidth(5);
			paper.add(circle);
		}

		// to html
		paper.toHtml(PATH_TO_DIRECTORY, fileName);
		
		System.out.println("-<" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
	}

	/**
	 * Prints 2D array
	 * 
	 * @param arr
	 */
	private static void print2DArray(String message, int[][] arr) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		System.out.println(message);

//		System.out.println("does not work:\t" + Arrays.toString(arr)); // does not work

		// this works
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("-<" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		System.out.println();
	}
}

