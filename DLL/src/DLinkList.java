//use node class here
public class DLinkList {
	Node head;
	Node tail;
	
	public DLinkList(){
		head = tail =null;
	}


	//<-------insert----------->
	public void insert(int d ) {
		Node tmp =new Node();
		tmp.setData(d);
		
		//if list is empty
		if(head == null ) {
			head =tail =tmp;
		}
		else {
			//whenever new node is inserted it goes in from left ie prev side of present head
			head.setPrev(tmp); //so head prev = temp
			tmp.setNext(head);//and temp next =head

			
			head =tmp;// head will move to tmp address and tail will remain at its position
		}
	}
	//<-------Print----------->
	public String toString() {
		String str="";
		Node it;
		it=head;
		while(it !=null) {
			str+=it+ "-->";
			it =it.getNext();
		}
		return str;
	}
	//<------append--------->
	public void append(int d) {
		Node temp =new Node();
		temp.setData(d);
		//if list is empty
		if(head== null) {
			
			head = tail =temp;
		}
		//append is always done from last ie right side of list ie to the next of tail
		else {
			tail.setNext(temp);
			temp.setPrev(tail);
			tail =temp;
		}
	}
	//<------Delete_first--------->
	public void delFirst() {
		if(head == null) {
			System.out.println("LL is empty");
		}
		else {
			Node tmp =head;
			head =head.getNext();
			head.setPrev(null);
			tmp.setNext(null);
		}
	}
	//<------Delete_Last--------->
	public void delLast() {
		if(head == null) {
			System.out.println("LL is empty");
		}
		else {
			Node tmp =tail;
			tail =tail.getPrev();
			tail.setNext(null);
			tmp.setPrev(null);
		}
	}
	//<------Delete_BY_Pos--------->
	public void delByPos(int pos) {
		int nCount = noOfNodes();
		if(pos == 1) {
			delFirst();
		}
		else if(pos == nCount) {
			delLast();
		}
		else if(pos>1 && pos < nCount) {
			Node it =head;
			
			while(pos != 1) {
				it = it.getNext();
				pos--;
			}
			Node temp = it;
			temp.getNext().setPrev(it.getPrev());
			temp.getPrev().setNext(it.getNext());
			it.setNext(null);
			it.setPrev(null);
			//System.out.println(temp);
		}
		else {
			System.out.println("Node not Found");
		}
	}
	//<------Insert_BY_Pos--------->
	public void insertByPos(int data,int pos) {
		Node temp =new Node();
		temp.setData(data);
		int nCount = noOfNodes();
		if(head == null) {//if list is empty
			head = tail = temp;
		}
		
		else {
			Node it =head;//it initalize
			//System.out.println(it);
			if(pos == 1) {
				insert(data);
			}
			else if(pos == nCount+1) {
				append(data);
			}
			else if(pos>1 && pos <= nCount) {
				while(pos != 2) {
					it =it.getNext();
					pos--;
				}
				Node itn = it.getNext();
				it.setNext(temp);
				temp.setPrev(it);
				itn.setPrev(temp);
				temp.setNext(itn);
				//System.out.println(it);
			}
		}
	}
	private int noOfNodes() {
		int cn =0;
		Node it =head;
		while(it != null) {
			cn++;
			it=it.getNext();
		}
		//System.out.println(cn);
		return cn;
	}
	public void reverseList() {
		if(head == null) {
			System.out.println("List Empty!!");
		}
		
		else {
			Node itp =null;
			Node it =head;
			Node temp =tail;
			
			while(it != null) {
			
				itp = it.getPrev();
				it.setPrev(it.getNext());
				it.setNext(itp);
				it =it.getPrev();
			}
			tail =head;
			head =temp;
			
		}
	}

}
