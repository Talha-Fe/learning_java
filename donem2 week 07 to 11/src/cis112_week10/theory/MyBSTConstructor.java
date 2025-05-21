package cis112_week10.theory;

public class MyBSTConstructor {

	public static MyBST<String> constructBST_S_412_nodeByNode() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		MyBST<String> tree = new MyBST<>();
		tree.insert("4");
		tree.insert("1");
		tree.insert("2");
		return tree;
	}

	public static MyBST<String> constructBST_S_empty() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = {};
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_1() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "1" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_12() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "1", "2" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_412() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "4", "1", "2" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_5836417() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "5", "8", "3", "6", "4", "1", "7" };
		return constructFromArray(arr);
	}

	/*
	 * CLRS
	 */

	public static MyBST<String> constructBST_S_CLRS12_2() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "15", "06", "18", "03", "07", "17", "20", "02", "04", "13", "09" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_CLRS12_4a() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "9", "4", "7", "6", "8" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_CLRS12_4b() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "9", "4", "2", "1", "3" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_CLRS12_4c() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "9", "4", "2", "5", "1", "3", "7", "6", "8" };
		return constructFromArray(arr);
	}

	public static MyBST<String> constructBST_S_CLRS12_4d() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = { "11", "04", "02", "09", "01", "03", "05", "10", "07", "06", "08" };
		return constructFromArray(arr);
	}

	/*
	 * some more
	 */
	public static MyBST<String> constructBST_S_1_19a() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = {//
				"08"//
				, "04", "16"//
				, "02", "06", "12", "18"//
				, "01", "03", "05", "07", "10", "14", "17", "19" //
				, "09", "11", "13", "15"//
				};
		return constructFromArray(arr);
	}
	public static MyBST<String> constructBST_S_1_19b() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		String[] arr = {//
				"16"//
				, "08", "18"//
				, "04", "12", "17", "19"//
				, "02", "06", "10", "14"//
				, "01", "03", "05", "07", "09", "11", "13", "15" //
				};
		return constructFromArray(arr);
	}

	/**
	 * Generic constructor
	 * 
	 * @param arr
	 * @return
	 */
	public static MyBST<String> constructFromArray(String[] arr) {
		MyBST<String> tree = new MyBST<>();
		for (int i = 0; i < arr.length; i++) {
			tree.insert(arr[i]);
		}
		return tree;
	}

}
