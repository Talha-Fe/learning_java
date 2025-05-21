package cis112_week09.theory;

/**
 * NodeSLLS for binary trees.
 * 
 * @param <T>
 * @author bingol
 */
public interface NodeBinaryInterface<T> {

	/**
	 * @return The value object.
	 */
	T data();

	/**
	 * @return The root node of left subtree.
	 */
	NodeBinaryInterface<T> left();

	/**
	 * @return The root node of right subtree.
	 */
	NodeBinaryInterface<T> right();

	/**
	 * 
	 * @return The canonical representation of the node. Usually just the
	 *         {@code value}.
	 */
	T canonical();

}
