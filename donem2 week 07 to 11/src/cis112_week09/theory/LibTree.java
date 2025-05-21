package cis112_week09.theory;

/**
 * Library for tree operations.
 * 
 * @param <T>
 * @author bingol
 */
public class LibTree<T> {

	// see:
	// https://stackoverflow.com/questions/869264/debug-standard-build-of-java-application
	private static final boolean DEBUG = true;
	private static final boolean DEBUG2 = true;
	private static final boolean DEBUG_M = true; // show method name

	/**
	 * Returns the height of the subtree whose root is the given {@code node}.
	 * 
	 * @param node a node or {@code null}
	 * @return the height of the subtree, or 0 if {@code node} is {@code null}
	 */
	public static <T> int height(NodeBinaryInterface<T> node) {
		if (node == null) {
			return 0;
		} else if (node.left() == null//
				&& node.right() == null) {
			return 0;
		} else {
			int h = 1 + Math.max(//
					height(node.left())//
					, height(node.right())//
			);

			if (DEBUG) {
				/**/System.out.println(//
						"lib.height n:" + node.canonical()//
								+ ", h:" + h//
				);
			}

			return h;
		}
	}

	/**
	 * Visualize the tree starting {@code node} at {@code level}
	 * 
	 * @param node
	 */
	public static <T> void plot(NodeBinaryInterface<T> node) {
		plot(node, 0, ">");
	}

	/**
	 * Visualize the tree starting {@code node} at {@code level}
	 * 
	 * @param node
	 * @param level     level of the node
	 * @param leftRight indicates left ("/") or right ("\") subtree
	 */
	private static <T> void plot(NodeBinaryInterface<T> node, int level, String leftRight) {

		if (node == null) {
			System.out.println("empty");
			return;
		}
		// right subtree
		if (node.right() != null) {
			plot(node.right(), level + 1, "/");
		}

		// print the node
		String indent = "  ".repeat(level); // indentation
		System.out.println(indent + leftRight + node.data());

		// left subtree
		if (node.left() != null) {
			plot(node.left(), level + 1, "\\");
		}
	}

	/**
	 * Prints a node and all of its descendants in sorted order.
	 * 
	 * @param node the root of the subtree to print
	 */
	public static <T> void print(NodeBinaryInterface<T> node) {
		println(node);
	}

	private static <T> void println(NodeBinaryInterface<T> node) {
		if (node == null) {
			return;
		}
		print(node.left());
		System.out.print(node.data() + " ");
		print(node.right());
	}

	public static <T> int size(MyBinaryTree<T> tree) {
		return size(tree.getRoot());
	}

	/**
	 * Not implemented
	 * 
	 * @param <T>
	 * @param node
	 * @return
	 */
	public static <T> int size(NodeBinaryInterface<T> node) {
		System.out.println("size is not implemented");
		return 0;
	}

	public static <T> String traverseInOrder(NodeBinaryInterface<T> node) {
		if (node == null) {
			/**/System.out.println("null");
			return "";
		}
		/**/System.out.println(node);
		String s = "";
		s += traverseInOrder(node.left());
		/**/System.out.println("--" + node);
		s += node.toString();
		s += traverseInOrder(node.right());
		return s;
	}

	public static <T> String traversePreOrder(NodeBinaryInterface<T> node) {
		if (node == null) {
			/**/System.out.println("null");
			return "";
		}
		/**/System.out.println(node);
		String s = "";
		s += node.toString();
		s += traversePreOrder(node.left());
		s += traversePreOrder(node.right());
		return s;
	}

	public static <T> String traversePostOrder(NodeBinaryInterface<T> node) {
		if (node == null) {
			/**/System.out.println("null");
			return "";
		}
		/**/System.out.println(node);
		String s = "";
		s += traversePostOrder(node.left());
		s += traversePostOrder(node.right());
		s += node.toString();
		return s;
	}

	/**
	 * Unique representation of the tree. It uses inorder tree traversal.
	 * 
	 * @param node
	 * @return
	 */
	public static <T> String canonical(NodeBinaryInterface<T> node) {
		if (node == null) {
			return ".";
		}
		String s = "";
		if (node.left() == null) {
			s += "/";
		} else {
			s += canonical(node.left());
		}

		s += "[" + node.canonical() + "]";

		if (node.right() == null) {
			s += "\\";
		} else {
			s += canonical(node.right());
		}
		return s;
	}

	/**
	 * Tree info.
	 * 
	 * @param <T>
	 * @param tree
	 */
	public static <T> void treeInfo(MyBinaryTree<T> tree) {
		if (DEBUG_M) {
			System.out
					.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		if (tree == null) {
			System.out.println("tree is null");
			return;
		} else if (tree.root == null) {
			System.out.println("root is null");
			return;
		}

		if (DEBUG) {
			tree.plot();
			System.out.println("\ncanonical:" + tree.canonical());
		}
		if (DEBUG2) {
			System.out.println("\ntraverseInOrder:" + tree.traverseInOrder());
			System.out.println("\ntraversePreOrder:" + tree.traversePreOrder());
			System.out.println("\ntraversePostOrder:" + tree.traversePostOrder());
			System.out.println("\nheight root:" + tree.height());
			System.out.println("\nheight left:" + tree.left().height());
			System.out.println("\nheight left.right:" + tree.left().right().height());
			// System.out.println("\nsize:" + tree.size()); // not implemented in LibTree
		}
	}

}
