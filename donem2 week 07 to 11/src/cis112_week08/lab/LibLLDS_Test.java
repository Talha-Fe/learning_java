package cis112_week08.lab;

import cis112_week08.theory.LinkedListDoublyS;

public class LibLLDS_Test {

	public static void main(String[] args) {

		LinkedListDoublyS lld;
		lld = LinkedListDoublyS.createLinkedListDoubly(0);
		lld = null;
		System.out.println("original:" + lld);

		lld = LibLLDS.reverse(lld);
		System.out.println("reversed:" + lld);
		System.out.println("cononica:" + lld.canonical());
	}

}
