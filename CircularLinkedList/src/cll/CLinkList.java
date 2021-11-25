package cll;

public class CLinkList {
	Node head;
	public CLinkList() {
		head =null;
	}

	public void revCLL() {
		Node itp;
		Node it;
		Node itn;
		itp =head;
		it=itn =head.getNext();
		while(it !=head) {
			itn =it.getNext();
			it.setNext(itp);
			itp =it;
			it =itn;
		}
		head =itp;
		it.setNext(head);
	}
	
	
	public void insert(int data) {
		Node temp =new Node();
		temp.setData(data);

		if(head == null) {
			head =temp;
			temp.setNext(head);
		}
		else {
			temp.setNext(head.getNext());
			head.setNext(temp);

			int x =head.getData();
			head.setData(temp.getData());
			temp.setData(x);

		}
	}

	public String toString() {
		String str ="";
		Node it =head;
		if(head == null) {return "CLL is empty!!";}

		do {
			str +=it+"-->";
			it= it.getNext();
		}while(it != head);
		return str;
	}

	public void append(int data) {
		Node temp = new Node();
		temp.setData(data);
		if(head == null) {
			head =temp;
			temp.setNext(head);
		}
		else {
			Node it =head;
			while(it.getNext() != head) {
				it =it.getNext();
			}
			it.setNext(temp);
			temp.setNext(head);
		}
	}

	public void delFirst() {
		if(head == null) {
			System.out.println("Cannot delete list is already empty!!");
		}
		else if(head.getNext() == head) {
			Node temp =head;
			head.setNext(null);
			head = null;
		}
		else {
			Node temp ;
			temp =head.getNext();

			int x =head.getData();
			head.setData(temp.getData());
			temp.setData(x);

			head.setNext(temp.getNext());
			temp.setNext(null);
		}
	}


	public void deleteLast() {
		if(head == null) {
			System.out.println("Cannot delete list is already empty!!");
		}
		else if(head.getNext() == head) {
			Node temp =head;
			head.setNext(null);
			head = null;
		}
		else {
			Node it = head;
			while(it.getNext().getNext() != head) {
				it= it.getNext();
			}
			it.getNext().setNext(null);
			it.setNext(head);
		}
	}

	public void insertByPos(int data,int pos) {
		int con = nodeCount();
		if(pos == 1) {
			insert(data);
		}
		else if (pos == con+1) {
			append(data);
		}
		else if(pos>1 && pos <=con) {
			Node it =head;
			while(pos != 2) {
				pos--;
				it =it.getNext();
			}
			
			Node temp =new Node();
			temp.setData(data);
			
			temp.setNext(it.getNext());
			it.setNext(temp);
			
/*			delete by pos code
			Node temp =it.getNext().getNext() ;
			it.getNext().setNext(null);
			it.setNext(temp);
	*/		
		}
		else {
			System.out.println("Invalid Position");
		}
	}

	private int nodeCount() {
		int n =1;
		if(head == null) {return 0;}
		Node it =head.getNext();
		while(it != head) {
			n++;
			it =it.getNext();
		}
		System.out.println(n);
		return n;
	}

	public void deleteByPos(int pos) {
		int con = nodeCount();
		if(pos == 1) {
			delFirst();
		}
		else if (pos == con) {
			deleteLast();
		}
		else if(pos>1 && pos <con) {
			Node it =head;
			while(pos != 2) {
				pos--;
				it =it.getNext();
			}
			
			Node temp =it.getNext().getNext() ;
			it.getNext().setNext(null);
			it.setNext(temp);
			
	}
		else {
			System.out.println("Invalid Position");
		}
		
	}

}
