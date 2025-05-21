package cis112_week10.theory;

/**
 * NodeSLLS for binary trees.
 * 
 * @param <T>
 * @author bingol
 */
public interface NodeBSTInterface<T> {

	/**
	 * @return The value object.
	 */
	T data();

	/**
	 * @return The parent of node.
	 */
	NodeBSTInterface<T> parent();

	/**
	 * @return The root node of left subtree.
	 */
	NodeBSTInterface<T> left();

	/**
	 * @return The root node of right subtree.
	 */
	NodeBSTInterface<T> right();

	/**
	 * 
	 * @return The canonical representation of the node. Usually just the
	 *         {@code value}.
	 */
	T canonical();

}
