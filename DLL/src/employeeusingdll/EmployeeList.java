package employeeusingdll;
//use node class here
public class EmployeeList {
	Node head;
	Node tail;

	public EmployeeList(){
		head = tail =null;
	}


	//<-------insert----------->
	public void insert(Employee e1 ) {
		Node tmp =new Node();
		tmp.setData(e1);

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
		if(head == null) {
			return "Empty queue";
		}
		String str="";
		Node it;
		it=head;
		while(it !=null) {
			str+=it+ "-->\n";
			it =it.getNext();
		}
		return str;
	}

	//<------Delete_Last--------->
	public void delete() {
		if(head == null) {
			System.out.println("LL is empty");
		}
		else if(head == tail) {
			head.setNext(null);
			head.setPrev(null);
			head =null;
		}
		else {
			Node tmp =tail;
			tail =tail.getPrev();
			tail.setNext(null);
			tmp.setPrev(null);
		}
	}


	public void maleEmp() {
		Node it;
		it =head;
		if(head == null) {System.out.println("Empty Queue");}
		else {
			while(it != null) {
				if(it.getData().getGender().equals("male")) {
					System.out.println(it);
				}
				it =it.getNext();
			}
		}
	}


	public void emptyQueue() {
		if(head == null) {System.out.println("Already empty"); return;}
		Node temp =head;
		while(temp.getNext() != null) {
			temp =head;
			head.getNext();
			temp.setNext(null);
			head.setPrev(null);
			
		}
	}


	public void isEmpty() {
		if(head == null) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Queue is not empty");
		}
		
	}


}
