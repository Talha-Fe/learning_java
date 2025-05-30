package cis112_week07.theory.linkStack;

import java.io.IOException;

class LinkStack_Test {
	
	public static void main(String[] args) throws IOException {
		LinkStack theStack = new LinkStack(); // make stack

		theStack.push(20); // push items
		theStack.push(40);

		theStack.displayStack(); // display stack

		theStack.push(60); // push items
		theStack.push(80);

		theStack.displayStack(); // display stack

		theStack.pop(); // pop items
		theStack.pop();

		theStack.displayStack(); // display stack
	}

}
