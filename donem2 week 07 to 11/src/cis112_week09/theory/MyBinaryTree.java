package cis112_week09.theory;

//based on Horstmann2019

/**
 * A binary tree in which each node has two children.
 * 
 * Note that {@code size} is missing.
 * 
 * @param <T> type of value
 * @author bingol
 */
public class MyBinaryTree<T> {

	protected MyNode<T> root;

	/**
	 * Constructs an empty tree.
	 */
	public MyBinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 * 
	 * @param value the value for the root
	 */
	public MyBinaryTree(T data) {
		root = new MyNode<>(data);
	}

	/**
	 * Constructs a binary tree.
	 * 
	 * @param data The data for the root.
	 * @param left The left subtree.
	 * @param right The right subtree.
	 */
	public MyBinaryTree(T data//
			, MyBinaryTree<T> left//
			, MyBinaryTree<T> right//
	) {
		root = new MyNode<>(data);

		if (left == null) {
			root.left = null;
		} else {
			root.left = left.root;
		}
		if (right == null) {
			root.right = null;
		} else {
			root.right = right.root;
		}
	}

	/**
	 * Gets the value at the root of this tree.
	 * 
	 * required for {@code LibTree}
	 * 
	 * @return the root value
	 */
	public T data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 * 
	 * required for {@code LibTree}
	 * 
	 * @return the left subtree of the root
	 */
	public MyBinaryTree<T> left() {
		// TODO change from tree to node
		MyBinaryTree<T> tree = new MyBinaryTree<>();
		tree.root = root.left;
		return tree;
	}

	/**
	 * Gets the root of this tree.
	 * 
	 * @return the root
	 */
	public MyNode<T> getRoot() {
		return root;
	}


	/**
	 * Sets the root of this tree.
	 * 
	 * @return the root
	 */
	public void setRoot(MyNode<T> node) {
		root = node;
	}

	/**
	 * Gets the right subtree of this tree.
	 * 
	 * required for {@code LibTree}
	 * 
	 * @return the right subtree of the root
	 */
	public MyBinaryTree<T> right() {
		MyBinaryTree<T> tree = new MyBinaryTree<>();
		tree.root = root.right;
		return tree;
	}

	/**
	 * Checks whether this tree is empty.
	 * 
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/*
	 * Common methods using LibTree
	 * 
	 */

	/**
	 * Returns the height of this tree.
	 * 
	 * @return the height
	 */
	public int height() {
		return LibTree.height(root);
	}

	/**
	 * Prints the contents of the tree in sorted order.
	 */
	public void print() {
		LibTree.print(root);
		System.out.println();
	}

	/**
	 * Traverse in-order
	 * 
	 * @return
	 */
	public String traverseInOrder() {
		return LibTree.traverseInOrder(root);
	}

	/**
	 * Traverse pre-order
	 * 
	 * @return
	 */
	public String traversePreOrder() {
		return LibTree.traversePreOrder(root);
	}

	/**
	 * Traverse post-order
	 * 
	 * @return
	 */
	public String traversePostOrder() {
		return LibTree.traversePostOrder(root);
	}

	/**
	 * Plot the tree
	 */
	public void plot() {
		LibTree.plot(root);
		System.out.println();
	}

	public String canonical() {
		return LibTree.canonical(root);
	}

}
