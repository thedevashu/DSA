package cll;
/*Complete Circular LL Operations on int
	- Insert
	- Append
	- DeleteFirst
	- DeleteLast
	- toString
	- InsertByPos
	- DeleteByPos*/
public class Main {
	public static void main(String[] args) {
		CLinkList cll =new CLinkList();
		cll.insert(12);
		cll.insert(13);
		cll.insert(23);
		cll.insert(33);
		System.out.println(cll);
		cll.append(50);
		cll.append(60);
		System.out.println(cll);
		cll.delFirst();
//		cll.delFirst();
//		cll.delFirst();
//		cll.delFirst();
//		cll.delFirst();
//		cll.delFirst();
		System.out.println(cll);
		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
//		cll.deleteLast();
		System.out.println(cll);
		cll.insertByPos(10, 4);
		System.out.println(cll);
		cll.deleteByPos(2);
		System.out.println(cll);
		cll.revCLL();
		System.out.println(cll);
		
	}
}
