package queueSLL;

public class LL {
	Node head;

	public LL(){
		head =null;
	}
	
	public void insert(int data) {
		Node temp =new Node(data);
		
		if(head ==null) {
			head =temp;
		}
		else {
			temp.setNext(head);
			head =temp;
		}
	}
	
	public void delete() {
	
		if(head==null) {
		System.out.println("Empty Queue");
		}
		else {
			Node it=new Node();
			it=head;
			while(it.getNext().getNext() != null) {
				it = it.getNext();
			}
			it.setNext(null);
		}
	}
	
	public String toString() {
		String str="";
		Node it =head;
		while(it!=null){
			str+=it+" ";
			it=it.getNext();
		}
		return str;
	}
}
