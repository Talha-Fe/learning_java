package cis112_week09.bjeo7_ch17;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree {
	
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 * 
	 * @param rootData the value for the root
	 */
	public BinaryTree(Object rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 * 
	 * @param rootData the value for the root
	 * @param left     the left subtree
	 * @param right    the right subtree
	 */
	public BinaryTree(Object rootData, BinaryTree left, BinaryTree right) {
		root = new Node();
		root.data = rootData;
		root.left = left.root;
		root.right = right.root;
	}

	class Node {
		public Object data;
		public Node left;
		public Node right;
	}

	/**
	 * Returns the height of the subtree whose root is the given node.
	 * 
	 * @param n a node or null
	 * @return the height of the subtree, or 0 if n is null
	 */
	private static int height(Node n) {
		if (n == null) {
			return 0;
		} else {
			return 1 + Math.max(height(n.left), height(n.right));
		}
	}

	/**
	 * Returns the height of this tree.
	 * 
	 * @return the height
	 */
	public int height() {
		return height(root);
	}

	/**
	 * Checks whether this tree is empty.
	 * 
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the value at the root of this tree.
	 * 
	 * @return the root value
	 */
	public Object data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 * 
	 * @return the left child of the root
	 */
	public BinaryTree left() {
		BinaryTree result = new BinaryTree();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 * 
	 * @return the right child of the root
	 */
	public BinaryTree right() {
		BinaryTree result = new BinaryTree();
		result.root = root.right;
		return result;
	}
	
}
