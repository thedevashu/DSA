package Practice;

public class LL {
	Node head;

	public LL(){
		head =null;
	}
	
	public void insertFront(int data) {
		Node temp =new Node(data);
		
		if(head ==null) {
			head =temp;
		}
		else {
			temp.setNext(head);
			head =temp;
		}
	}
	
	public void insertBack(int data) {
		Node temp =new Node(data);
		if(head==null) {
		head =temp;
		}
		else {
			Node it=new Node();
			it=head;
			while(it.getNext() != null) {
				it = it.getNext();
			}
			it.setNext(temp);
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

	private void delNextNode(Node temp) {
		
		 
		
		Node oddN =temp.getNext();
//		Node nNode =oddN.getNext();
		temp.setNext(oddN.getNext());
		oddN.setNext(null);
		
		
	}
	public void delOddNode() {
		Node temp =head.getNext();
		int i =1;
		
		while(temp != null) {
			
			if(i!= noOfNodes()) {
				delNextNode(temp);
			}
			i++;
			temp =temp.getNext();
		}
		Node temp2 =head;
		head = head.getNext();
		temp2.setNext(null);
		
	}

	private int noOfNodes() {
		int n=0;
		Node it=head;
		while(it.getNext() != null) {
			n++;
			it=it.getNext();
		}
//		System.out.println(n);
		return n;
	}
}
