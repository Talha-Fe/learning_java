package cis112_week09.bjeo7_ch17;

import java.util.List;
import java.util.ArrayList;

/**
 * A tree in which each node has an arbitrary number of children.
 */
public class Tree2 {
	
	private Node root;

	class Node {
		public Object data;
		public List<Node> children;

		/**
		 * Computes the size of the subtree whose root is this node.
		 * 
		 * @return the number of nodes in the subtree
		 */
		public int size() {
			int sum = 0;
			for (Node child : children) {
				sum = sum + child.size();
			}
			return 1 + sum;
		}
	}

	/**
	 * Constructs an empty tree.
	 */
	public Tree2() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 * 
	 * @param rootData the value for the root
	 */
	public Tree2(Object rootData) {
		root = new Node();
		root.data = rootData;
		root.children = new ArrayList<>();
	}

	/**
	 * Adds a subtree as the last child of the root.
	 */
	public void addSubtree(Tree2 subtree) {
		root.children.add(subtree.root);
	}

	/**
	 * Computes the size of this tree.
	 * 
	 * @return the number of nodes in the tree
	 */
	public int size() {
		if (root == null) {
			return 0;
		} else {
			return root.size();
		}
	}

	// Additional methods will be added in later sections.
	
}
