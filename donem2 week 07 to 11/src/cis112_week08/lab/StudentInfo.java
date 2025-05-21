package cis112_week08.lab;

/**
 * Please fill this with your own info.
 * 
 * @author bingol
 */
public interface StudentInfo {

	String studentName = "aaa"; // your name
	String studentLastName = "bbb"; // your last name
	String studentNo = "12345678-123"; // your student no
	String course = "cis111"; // courseID ID
	String section = "1"; // your section

	/**
	 * Do not change {@code studentTag}.
	 */
	static void studentTag() {
		System.out.println("~".repeat(50));
		System.out.println("~ Course:\t" + course + "." + section);
		System.out.println("~ Student:\t" + studentNo + " " + studentLastName.toUpperCase() + ", " + studentName);
		System.out.println("~".repeat(50));
	}

}
