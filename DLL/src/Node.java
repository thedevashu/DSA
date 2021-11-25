//node having data address of prev node and next node
public class Node {
	private Node prev ;
	private int data;
	private Node next;
	
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	
	public String toString() {
		String str = "";
		str+=data;
		return str;
	}
}
