package cis111_week11.lab;

/**
 * Write a recursive algorithm that finds all occurrences of a substring in a
 * string. Example - “ab” takes place in “abab” for 2 times or - “aa” takes
 * places in “aaaa” for 3 times. int recursive3( char * substr, char * str);
 * 
 * @author bingol
 */
public class OccuranceNumber {

	private static final boolean DEBUG = false;

	public static void main(String[] args) {
//		String text = "ab";
//		String text = "abab";
//		String text = "ababab";
//		String searched = "ab";

		String text = "aaaaa";
		String searched = "aa";
		System.out.println("Number of occurance=" + recursiveCount(text, searched));
	}

	public static int recursiveCount(String text, String searched) {
		if (DEBUG) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
			System.out.println("text=" + text);
		}

		int r = 0;

		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
		int s1 = searched.length();
		
		if(text.length() >= searched.length()) {
			
			if(text.substring(0, s1).equals(searched) ) {
				
				
				
				r++;
				return recursiveCount(text.substring(1),searched) + r;
				
			}
			
			return recursiveCount(text.substring(1),searched) + r;
			
		}

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A

		if (DEBUG) {
			System.out
					.println("\n-<" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		return r;
	}

}
