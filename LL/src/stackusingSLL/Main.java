package stackusingSLL;

public class Main {

	public static void main(String[] args) {
		Stack l1=new Stack();
		l1.push(12);
		l1.push(22);
		l1.push(32);
		l1.push(42);
		System.out.println(l1);
		l1.pop();
		l1.pop();
		l1.push(42);
		l1.push(32);
		System.out.println(l1);
	}

}
