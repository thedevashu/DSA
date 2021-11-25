import Practice.Node;

public class LinkList {
	Node head;
	public LinkList(){
		head =null;

	}

	//--------INSERT_AT_LAST_POSITION----------
	public void append(int data) {
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
	//<---------------END--------------->



	//--------INSERT_AT_FIRST_POSITION----------
	public void insert(int data) {
		Node temp =new Node(data);
		if(head ==null) {
			//no element
			head =temp;
		}
		else {
			if(head.getNext() ==null) {
				temp.setNext(head);
				head=temp;
			}
			else {
				temp.setNext(head);
				head =temp;
			}
		}
	}
	//<-----------------END-------------------->


	//--------DELET_AT_GIVEN_POSITION----------
	public void delAtPos(int pos) {
		int n =numOfNode();
		Node it =head;

		if(pos == 1) {
			deletFirst();
		}
		else if(pos == n+1) {
			deletLast();
		}
		else if(pos>1 && pos <n) {
			for(int i =1;i<pos-1;i++) {
				it =it.getNext();
			}
			Node temp =it.getNext().getNext();
			it.setNext(temp);
			//temp.setNext(null);

			//it = it.getNext();
			//			temp.setNext(null);
			//System.out.println(temp);
		}
		else {

			System.out.println("Invalid position to delete");

		}

	}
	private int numOfNode() {
		int num=0;
		Node it=head;

		while(it.getNext() != null){
			it =it.getNext();
			num++;
		}
		return num;
	}
	//<----------------END---------------->


	//--------DELETE_AT_LAST_POSITION----------
	public void deletLast() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node it =head;
			while(it.getNext().getNext() != null) {
				it =it.getNext();
			}
			Node temp =it;
			it.setNext(null);

		}
	}
	//<--------------END---------------->


	//--------DELETE_AT_FIRST_POSITION----------
	public void deletFirst(){
		Node temp =head;
		if(head ==null) {
			System.out.println("List is empty");
		}
		else {
			//temp =head.getNext();
			head = temp.getNext();
		}
	}
	//<--------------END---------------->


	//--------INSERT_AT_GIVEN_POSITION----------
	public void insertAtPos(int data, int pos) {
		Node temp = new Node(data);
		int n =numOfNode();
		if(pos == 1) {
			insert(data);
		}
		else if(pos == n+1) {
			append(data);
		}
		else if(pos>1 && pos<n) {
			Node it =head;
			for(int i= 1;i<pos-1;i++) {
				it=it.getNext();
			}
			temp.setNext(it.getNext());
			it.setNext(temp);
			//System.out.println(it);
		}
	}
	//<--------------END---------------->

	//---------------REVERSE_NODE----------------
	public void revNode() {
		Node itp =null;
		Node it,itn;
		it =itn =head;
		
		while(it !=null) {
			itn =itn.getNext();
			it.setNext(itp);
			itp =it;
			it=itn;
		}
		head =itp;
	}

	public String toString() {
		String str="";
		Node it =head;
		while(it != null) {
			str+=" "+ it+ "";
			it=it.getNext();
		}
		return str;
	}
}
