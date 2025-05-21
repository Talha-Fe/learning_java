package cis112_week08.theory;

/**
 * Node for singly linked list of String's
 * 
 * @author bingol
 */
public class NodeLLDS {

	public String data = null;
	public NodeLLDS next = null;
	public NodeLLDS prev = null;

	public NodeLLDS(String s) {
		this.data = s;
	}

	@Override
	public String toString() {
		return "[NodeLLDS: data=" + data + "]";
	}

}
