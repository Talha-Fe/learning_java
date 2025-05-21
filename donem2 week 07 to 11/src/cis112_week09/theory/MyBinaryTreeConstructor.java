package cis112_week09.theory;

public class MyBinaryTreeConstructor {

	private static final boolean DEBUG = false;
	private static final boolean DEBUG_M = false;
	private static final boolean DEBUG2 = false;

	private static final Integer int1 = 1;
	private static final Integer int2 = 2;
	private static final Integer int3 = 3;
	private static final Integer int5 = 5;
	private static final Integer int6 = 6;

	public static MyBinaryTree<Integer> constructBT_I_empty() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<Integer> tree;
		tree = //
				new MyBinaryTree<>();

		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_t() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("t");
		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_t_l() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("t", //
						new MyBinaryTree<>("l"), //
						null//
				);
		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_t_r() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("t", //
						null, //
						new MyBinaryTree<>("r") //
				);
		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_t_lr() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("t", //
						new MyBinaryTree<>("l"), //
						new MyBinaryTree<>("r") //
				);
		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_t_lr_ll_llr() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("t", //
						new MyBinaryTree<>("l", //
								new MyBinaryTree<>("ll", //
										null, //
										new MyBinaryTree<>("llr") //
								), //
								null//

						), //
						new MyBinaryTree<>("r") //
				);
		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_t_lr_ll_llr_rl() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("t" //
						, new MyBinaryTree<>("l" //
								, new MyBinaryTree<>("ll" //
										, null //
										, new MyBinaryTree<>("llr") //
								) //
								, new MyBinaryTree<>("lr")//

						) //
						, new MyBinaryTree<>("r"//
								, new MyBinaryTree<>("rl")//
								, null//
						) //
				);
		return tree;
	}

	public static MyBinaryTree<Integer> constructBT_I_1_2_3_5() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<Integer> tree;
		tree = //
				new MyBinaryTree<>(int1 //
						, new MyBinaryTree<>(int2 //
								, null //
								, new MyBinaryTree<>(int5) //
						) //
						, new MyBinaryTree<>(int3) //
				);

		return tree;
	}

	public static MyBinaryTree<Integer> constructBT_I_1_2_3_5_6() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

//		Integer int1 = 1;
//		Integer int2 = 2;
//		Integer int3 = 3;
//		Integer int5 = 5;

		MyBinaryTree<Integer> tree;
		tree = //
				new MyBinaryTree<>(int1 //
						, new MyBinaryTree<>(int2 //
								, null //
								, new MyBinaryTree<>(int5) //
						) //
						, new MyBinaryTree<>(int3//
								, new MyBinaryTree<>(int6)//
								, null) //
				);

		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_1_6() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("1", //
						new MyBinaryTree<>("2", //
								new MyBinaryTree<>("4"), //
								new MyBinaryTree<>("5") //
						), //
						new MyBinaryTree<>("3", //
								new MyBinaryTree<>("6"), //
								null //
						) //
				);

		return tree;
	}

	public static MyBinaryTree<String> constructBT_S_Expression() {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// ( 8 + 7 ) * ( 5 - 2 )
		MyBinaryTree<String> tree;
		tree = //
				new MyBinaryTree<>("*", //
						new MyBinaryTree<>("+", //
								new MyBinaryTree<>("8"), //
								new MyBinaryTree<>("7") //
						), //
						new MyBinaryTree<>("-", //
								new MyBinaryTree<>("5"), //
								new MyBinaryTree<>("2") //
						) //
				);

		// check
		tree.plot();
		System.out.println("\ncanonical:" + tree.canonical());
		System.out.println("\ntraverseInOrder:" + tree.traverseInOrder());
		//
		System.out.println("\nheight root:" + tree.height());
		System.out.println("\nheight left:" + tree.left().height());
		System.out.println("\nheight left.right:" + tree.left().right().height());

		return tree;
	}

}
