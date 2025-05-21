package cis112_week10.theory;

/**
 * Library for Binary Search Tree (BST) operations.
 * 
 * @param <T>
 * @author bingol
 */
public class LibBST<T extends Comparable<T>> {

	// see:
	// https://stackoverflow.com/questions/869264/debug-standard-build-of-java-application
	private static final boolean DEBUG = false;
	private static final boolean DEBUG2 = false;

	/**
	 * Returns the height of the subtree whose root is the given {@code node}.
	 * 
	 * @param node a node or {@code null}
	 * @return the height of the subtree, or 0 if {@code node} is {@code null}
	 */
	public static <T> int height(NodeBSTInterface<T> node) {
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
				System.out.println(//
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
	public static <T> void plot(NodeBSTInterface<T> node) {
		plot(node, 0, ">");
	}

	/**
	 * Visualize the tree starting {@code node} at {@code level}
	 * 
	 * @param node
	 * @param level     level of the node
	 * @param leftRight indicates left ("/") or right ("\") subtree
	 */
	private static <T> void plot(NodeBSTInterface<T> node, int level, String leftRight) {

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
	public static <T> void print(NodeBSTInterface<T> node) {
		println(node);
	}

	private static <T> void println(NodeBSTInterface<T> node) {
		if (node == null) {
			return;
		}
		print(node.left());
		System.out.print(node.data() + " ");
		print(node.right());
	}

	public static <T> NodeBSTInterface<T> minimum(NodeBSTInterface<T> x) {
		while (x.left() != null) {
			x = x.left();
		}
		return x;
	}

	public static <T> NodeBSTInterface<T> maximum(NodeBSTInterface<T> x) {
		while (x.right() != null) {
			x = x.right();
		}
		return x;
	}

	public static <T> NodeBSTInterface<T> successor(NodeBSTInterface<T> x) {
		if (x.right() != null) {
			// leftmost node in the right subtree
			return minimum(x.right());
		} else {
			// find the lowest ancestor of x whose left child is an ancestor of x
			NodeBSTInterface<T> y = null;
			y = x.parent();
			while (y != null && x == y.right()) {
				x = y;
				y = y.parent();
			}
			return y;
		}
	}

	public static <T> NodeBSTInterface<T> predecessor(NodeBSTInterface<T> x) {
		System.out.println("LibBSTree.predecessor is not implemented");
		return null;
	}

//	public static <T> NodeBinaryInterface<T> search(T value) {
//		return search(root, value);
//	}

	public static <T extends Comparable<T>> NodeBSTInterface<T> search(NodeBSTInterface<T> x, T data) {
		if (x == null || data.equals(x.data())) {
			return x;
		}
		if (data.compareTo(x.data()) < 0) {
			return search(x.left(), data);
		} else {
			return search(x.right(), data);
		}
	}

	/**
	 * Not implemented
	 * 
	 * @param <T>
	 * @param node
	 * @return
	 */
	public static <T> int size(NodeBSTInterface<T> node) {
		System.out.println("size is not implemented");
		return 0;
	}

	public static <T> void traverseInOrder(NodeBSTInterface<T> node, VisitorInterface<T> v) {
		if (node == null) {
			return;
		}
		if (DEBUG2) {
			System.out.println(node);
		}
		traverseInOrder(node.left(), v);
		v.visit(node);
		traverseInOrder(node.right(),v);
	}

	public static <T> String traverseInOrder(NodeBSTInterface<T> node) {
		if (node == null) {
			if (DEBUG2) {
				System.out.println("null");
			}
			return "";
		}
		if (DEBUG2) {
			System.out.println(node);
		}
		String s = "";
		s += traverseInOrder(node.left());
		s += node.toString();
		s += traverseInOrder(node.right());
		return s;
	}

	public static <T> String traversePreOrder(NodeBSTInterface<T> node) {
		if (node == null) {
			if (DEBUG2) {
				System.out.println("null");
			}
			return "";
		}
		if (DEBUG2) {
			System.out.println(node);
		}
		String s = "";
		s += node.toString();
		s += traversePreOrder(node.left());
		s += traversePreOrder(node.right());
		return s;
	}

	public static <T> String traversePostOrder(NodeBSTInterface<T> node) {
		if (node == null) {
			if (DEBUG2) {
				System.out.println("null");
			}
			return "";
		}
		if (DEBUG2) {
			System.out.println(node);
		}
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
	public static <T> String canonical(NodeBSTInterface<T> node) {
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

}
