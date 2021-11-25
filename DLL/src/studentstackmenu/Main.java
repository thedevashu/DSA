package studentstackmenu;

import java.util.Scanner;

/*Implement Stack of Student using DLL (Menu-Driven)
	- Push Student
	- Pop Student
	- Print Stack
	- Empty Stack
	- isEmpty (true/false)
 */
public class Main {

	public static void main(String[] args) {
		StudentStack stk =new StudentStack();
	
		Scanner scn =new Scanner(System.in);
		System.out.println("<----------WEL-COME---------->");
		

		menu(stk,scn);

	}

	private static void menu(StudentStack stk,Scanner scn) {
		while(true) {
			System.out.println("Press 1. Push Student");
			System.out.println("Press 2. Pop Student");
			System.out.println("Press 3. Print Stack");
			System.out.println("Press 4. Empty Stack");
			System.out.println("Press 5. isEmpty (true/false)");
			int op=scn.nextInt();
			if(op>5 || op <0) {
				break;
			}
			switch(op) {
				case 1:{
					System.out.println("Enter Roll no.");
					int rlno = scn.nextInt();
					System.out.println("Enter name:");
					String name =scn.next();
					System.out.println("Marks");
					float m =scn.nextFloat();
					
					Student s =new Student(rlno,name,m);
					stk.push(s);
					break;
				}
				case 2:{
					stk.pop();
					System.out.println("!!Student poped!!");
					break;
				}
				case 3:{
					System.out.println(stk);
					break;
				}
				case 4:{
					stk.emptyStack();
					break;
				}
				case 5:{
					stk.isEmpty();
					break;
				}
				
			}
		}
	}

}
