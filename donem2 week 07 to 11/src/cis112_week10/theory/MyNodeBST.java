package cis112_week10.theory;

/**
 * NodeSLLS for binary search tree
 * 
 * @param <T> type of value
 * @author bingol
 */
public class MyNodeBST<T extends Comparable<T>> implements NodeBSTInterface<T> {

	T data;
	MyNodeBST<T> parent;
	MyNodeBST<T> left;
	MyNodeBST<T> right;

	public MyNodeBST() {
		this(null);
	}

	public MyNodeBST(T data) {
		this.data = data;
		parent = null;
		left = null;
		right = null;
	}

//	/**
//	 * Inserts a new node as a descendant of this node.
//	 * 
//	 * @param newNode the node to insert
//	 */
//	public void addNode(MyNodeBST<T> newNode) {
//		int comp = newNode.data.compareTo(value);
//		if (comp < 0) {
//			if (left == null) {
//				left = newNode;
//			} else {
//				((MyNodeBST<T>) left).addNode(newNode);
//			}
//		} else if (comp > 0) {
//			if (right == null) {
//				right = newNode;
//			} else {
//				((MyNodeBST<T>) right).addNode(newNode);
//			}
//		} else {
//			// comp == 0 case
//			// nops for set implementation
//		}
//	}

	/*
	 * Methods of subtree starting at {@code this} node
	 */

//	/**
//	 * Size of the subtree starting at {@code this} node
//	 */
//	public int size() {
//		return LibBSTree.size(this);
//	}

	/**
	 * Visualize the subtree starting at {@code this} node
	 */
	public void plot() {
		LibBST.plot(this);
	}

	/*
	 * methods for NodeBinaryInterface
	 */

	@Override
	public NodeBSTInterface<T> parent() {
		return parent;
	}

	@Override
	public NodeBSTInterface<T> left() {
		return left;
	}

	@Override
	public NodeBSTInterface<T> right() {
		return right;
	}

	@Override
	public T data() {
		return data;
	}

	@Override
	public T canonical() {
		return data;
	}

	@Override
	public String toString() {
		return "[MyNodeBST " + data + "]";
	}

}
