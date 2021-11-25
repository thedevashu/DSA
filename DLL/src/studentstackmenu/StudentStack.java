package studentstackmenu;
//use node class here
public class StudentStack {
	Node head;
	Node tail;
	
	public StudentStack(){
		head = tail =null;
	}


	//<-------insert----------->
	public void push(Student d ) {
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
	
	//<------Delete_first--------->
	public void pop() {
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


	public void emptyStack() {
		Node temp =head;
		while(temp.getNext() != null) {
			temp =head;
			head =temp.getNext();
			temp.setNext(null);
			head.setPrev(null);	
		}
		head =tail =null;
		
	}


	public void isEmpty() {
		if(head==null) {
			System.out.println("Stack is Empty!");
		}
		else {
			System.out.println("Stack is not Empty");
		}
		
	}
	
	
	

}
