package week05.lab;

//  _              $$\     $$\ $$\       $$\                               
// | |             $$ |    $$ |$$ |      \__|                              
// | |__  _   _  $$$$$$\   $$ |$$$$$$$\  $$\  $$$$$$\   $$$$$$\  $$$$$$$\  
// | '_ \| | | | \_$$  _|  $$ |$$  __$$\ $$ |$$  __$$\ $$  __$$\ $$  __$$\ 
// | |_) | |_| |   $$ |    $$ |$$ |  $$ |$$ |$$ |  \__|$$ /  $$ |$$ |  $$ |
// |_.__/ \__, |   $$ |$$\ $$ |$$ |  $$ |$$ |$$ |      $$ |  $$ |$$ |  $$ |
//         __/ |   \$$$$  |$$ |$$ |  $$ |$$ |$$ |      \$$$$$$  |$$ |  $$ |
//        |___/     \____/ \__|\__|  \__|\__|\__|       \______/ \__|  \__|

public class TriangleV0 {

	static final int SIZE = 5;
	static int SIZE_M1 = SIZE - 3;;

	public static void main(String[] args) {
		
		for(int i = 0; i < SIZE; i += 2) {
			for(int j = SIZE_M1; j >= 0; j--) {
				if (j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			SIZE_M1++;
			System.out.println(); //SATIR ATLAMA
		}
	}
}
