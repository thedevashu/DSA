package circularqueue;

public class Main {

	public static void main(String[] args) {
		CQueue q1= new CQueue(5);
//		CQueue q2= new CQueue(5);
		CQueue q3= new CQueue(5);
		q1.insert(10);
		q1.insert(20);
		q1.insert(30);
		q1.insert(40);
//		q1.delet();
		q1.insert(50);
		q1.delet();
		q1.insert(15);
//		q1.insert(20);
//		q1.insert(1);
//		q1.insert(2);
//		q1.insert(4);
//		q1.delet();
//		q1.insert(4);
//		q1.delet();
//		q1.insert(8);
//		q1.insert(6);
//		q1.delet();
//		q1.delet();
//		q1.delet();
//		q1.delet();
//		q1.delet();
//		q1.delet();
		System.out.println(q1);
//		q2.insert(1);
//		q2.insert(2);
//		q2.insert(3);
//		q2.insert(4);
//		q2.delet();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		q3.sameAs(q1);
		System.out.println(q3);
		
		
		
		
		
	}

}
