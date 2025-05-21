package cis112_week09.theory;

/**
 * MyNode for MyBinary tree.
 * 
 * @param <T> The type of data.
 * @author bingol
 */
public class MyNode<T> implements NodeBinaryInterface<T> {

	T data;
	MyNode<T> left;
	MyNode<T> right;

	public MyNode() {
		this(null);
	}

	public MyNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}

	@Override
	public NodeBinaryInterface<T> left() {
		return left;
	}

	@Override
	public NodeBinaryInterface<T> right() {
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
		return "[MyNode: value=" + data + "]";
	}

//	@Override
//	public int compareTo(T o) {
//		return value.compareTo(o);
//	}


}
