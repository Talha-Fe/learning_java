package cis112_week10.theory;

// based on Horstmann2019

/**
 * A binary search tree whose nodes hold value that implement the Comparable
 * interface.
 * 
 * @param <T> type of value
 * @author bingol
 */
public class MyBST<T extends Comparable<T>> {

	MyNodeBST<T> root;

	/**
	 * Constructs an empty tree.
	 */
	public MyBST() {
		root = null;
	}

	/**
	 * Gets the root of this tree.
	 * 
	 * @return the root
	 */
	public MyNodeBST<T> getRoot() {
		return root;
	}

	/**
	 * Inserts value into proper location in the tree
	 * 
	 * @param value
	 */
	public void insert(T data) {
		if (data == null) {
			return;
		}
		MyNodeBST<T> x = root;
		MyNodeBST<T> y = null;
		MyNodeBST<T> z = new MyNodeBST<>(data);
		while (x != null) {
			y = x;
			if (z.data.compareTo(x.data) < 0) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		// location is found.
		z.parent = y;
		if (y == null) {
			root = z;
		} else if (z.data.compareTo(y.data) < 0) {
			y.left = z;
		} else {
			y.right = z;
		}
	}

	/**
	 * Replaces the subtree rooted at node {@code u} with the subtree rooted at node
	 * {@code v}, node {@code u}’s parent becomes node {@code v}’s parent, and
	 * {@code u}’s parent ends up having {@code v} as its appropriate child.
	 * 
	 * @param u
	 * @param v
	 */
	public void transplant(MyNodeBST<T> u, MyNodeBST<T> v) {
		if (u.parent == null) {
			root = v;
		} else if (u == u.parent.left) {
			u.parent.left = v;
		} else {
			u.parent.right = v;
		}
		if (v != null) {
			v.parent = u.parent;
		}
	}

	public void delete(MyNodeBST<T> z) {
		MyNodeBST<T> y = null;

		if (z.left == null) {
			// replace z by its right child
			transplant(z, z.right);
		} else if (z.right == null) {
			// replace z by its left child
			transplant(z, z.left);
		} else {
			// y is z's successor
			y = minimum(z.right);
			if (y != z.right) {
				// y is farther down in the tree
				// replace y by its right child
				transplant(y, y.right);
				// z's right child becomes y's right child
				y.right = z.right;
				y.right.parent = y;
			}
			// replace z by its successor y
			transplant(z, y);
			// z's right child, which has no let child, becomes y's right child
			y.left = z.left;
			y.left.parent = y;
		}
	}

	public MyNodeBST<T> minimum() {
		return (MyNodeBST<T>) LibBST.minimum(root);
	}

	public MyNodeBST<T> minimum(MyNodeBST<T> x) {
		return (MyNodeBST<T>) LibBST.minimum(x);
	}

	public MyNodeBST<T> maximum() {
		return (MyNodeBST<T>) LibBST.maximum(root);
	}

	public MyNodeBST<T> maximum(MyNodeBST<T> x) {
		return (MyNodeBST<T>) LibBST.maximum(x);
	}

	public MyNodeBST<T> successor() {
		return (MyNodeBST<T>) LibBST.successor(root);
	}

	public MyNodeBST<T> successor(MyNodeBST<T> x) {
		return (MyNodeBST<T>) LibBST.successor(x);
	}

	public MyNodeBST<T> predecessor() {
		return (MyNodeBST<T>) LibBST.predecessor(root);
	}

	public MyNodeBST<T> predecessor(MyNodeBST<T> x) {
		return (MyNodeBST<T>) LibBST.predecessor(x);
	}

	public MyNodeBST<T> search(T data) {
		return search(root, data);
	}

	public MyNodeBST<T> search(MyNodeBST<T> x, T data) {
		if (x == null || data.equals(x.data)) {
			return x;
		}
		if (data.compareTo(x.data) < 0) {
			return search(x.left, data);
		} else {
			return search(x.right, data);
		}
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
		return LibBST.height(root);
	}

	/**
	 * Prints the contents of the tree in sorted order.
	 */
	public void print() {
		LibBST.print(root);
		System.out.println();
	}

	/**
	 * Traverse in-order
	 * 
	 * @return
	 */
	public String traverseInOrder() {
		return LibBST.traverseInOrder(root);
	}

	public void traverseInOrder(VisitorInterface<T> v) {
		LibBST.traverseInOrder(root, v);
	}

	/**
	 * Traverse pre-order
	 * 
	 * @return
	 */
	public String traversePreOrder() {
		return LibBST.traversePreOrder(root);
	}

	/**
	 * Traverse post-order
	 * 
	 * @return
	 */
	public String traversePostOrder() {
		return LibBST.traversePostOrder(root);
	}

	/**
	 * Plot the tree
	 */
	public void plot() {
		LibBST.plot(root);
		System.out.println();
	}

	public String canonical() {
		return LibBST.canonical(root);
	}

//	/**
//	 * Sets the root of this tree.
//	 * 
//	 * @param node
//	 */
//	public void setRoot(MyNodeBST<T> node) {
//		super.setRoot(node);
//	}

//	/**
//	 * Inserts a new node into the tree.
//	 * 
//	 * @param value the object to insert
//	 */
//	public void add(T value) {
//		MyNodeBST<T> newNode = new MyNodeBST<T>(value);
//		if (getRoot() == null) {
//			setRoot(newNode);
//		} else {
//			getRoot().addNode(newNode);
//		}
//	}

//	/**
//	 * Tries to find an object in the tree.
//	 * 
//	 * @param value the object to find
//	 * @return true if the object is contained in the tree
//	 */
//	public boolean find(T value) {
//		MyNodeBST<T> current = getRoot();
//		while (current != null) {
//			int comp = current.data.compareTo(value);
//			if (comp == 0) {
//				return true;
//			} else if (comp > 0) {
//				current = current.left;
//			} else {
//				current = current.right;
//			}
//		}
//		return false;
//	}

//	/**
//	 * Tries to remove an object from the tree. Does nothing if the object is not
//	 * contained in the tree.
//	 * 
//	 * @param value the object to remove
//	 */
//	public void remove(T value) {
//
//		// Find node to be removed
//		MyNodeBST<T> toBeRemoved = getRoot();
//		MyNodeBST<T> parent = null;
//		boolean found = false;
//		while (!found && toBeRemoved != null) {
//			int comp = toBeRemoved.data.compareTo(value);
//			if (comp == 0) {
//				found = true;
//			} else {
//				parent = toBeRemoved;
//				if (comp > 0) {
//					toBeRemoved = toBeRemoved.left;
//				} else {
//					toBeRemoved = toBeRemoved.right;
//				}
//			}
//		}
//		if (!found) {
//			return;
//		}
//
//		// toBeRemoved contains value
//		// If one of the children is empty, use the other
//
//		if (toBeRemoved.left == null || toBeRemoved.right == null) {
//			MyNodeBST<T> newChild;
//			if (toBeRemoved.left == null) {
//				newChild = toBeRemoved.right;
//			} else {
//				newChild = toBeRemoved.left;
//			}
//
//			if (parent == null) {
//				// Found in root
//				setRoot(newChild);
////				root = newChild;
//			} else if (parent.left == toBeRemoved) {
//				parent.left = newChild;
//			} else {
//				parent.right = newChild;
//			}
//			return;
//		}
//
//		// Neither subtree is empty
//		// Find smallest element of the right subtree
//
//		MyNodeBST<T> smallestParent = toBeRemoved;
//		MyNodeBST<T> smallest = toBeRemoved.right;
//		while (smallest.left != null) {
//			smallestParent = smallest;
//			smallest = smallest.left;
//		}
//
//		// smallest contains smallest child in right subtree
//		// Move contents, unlink child
//
//		toBeRemoved.data = smallest.data;
//		if (smallestParent == toBeRemoved) {
//			smallestParent.right = smallest.right;
//		} else {
//			smallestParent.left = smallest.right;
//		}
//	}

	/*
	 * Common methods using LibTree
	 * 
	 */

	/**
	 * 
	 * @return number of nodes in the tree
	 */
	public int size() {
		return LibBST.size(getRoot());
	}

}
