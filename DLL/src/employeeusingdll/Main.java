package employeeusingdll;

import java.util.Scanner;



/*Implement Employee Queue using DLL (Menu-Driven)
	- insert
	- remove
	- Print all Male emp
	- Print all emp
	- empty queue
	- isEmpty (true/false)*/
public class Main {

	public static void main(String[] args) {
		EmployeeList qu =new EmployeeList();
		
		Scanner scn =new Scanner(System.in);
		System.out.println("<----------WEL-COME---------->");
		

		menu(qu,scn);
	}
	
	private static void menu(EmployeeList stk,Scanner scn) {
		while(true) {
			System.out.println("Press 1. insert");
			System.out.println("Press 2. remove");
			System.out.println("Press 3. Print all Male emp");
			System.out.println("Press 4. Print all emp");
			System.out.println("Press 5.  empty queue");
			System.out.println("Press 6.  isEmpty (true/false)");
			int op=scn.nextInt();
			if(op>6 || op <1) {
				break;
			}
			switch(op) {
				case 1:{
					
					System.out.println("Enter name:");
					String name =scn.next();
					System.out.println("Enter ID no.");
					int id = scn.nextInt();
					System.out.println("Salary");
					int m =scn.nextInt();
					System.out.println("Gender:");
					String g = scn.next();
					
					Employee s =new Employee(name,id,m,g);
					stk.insert(s);
					System.out.println("!!Action Complete!!");
					break;
				}
				case 2:{
					stk.delete();
					System.out.println("!!Action Complete!!");
					break;
				}
				case 3:{
					stk.maleEmp();
					break;
				}
				case 4:{
					System.out.println(stk);
					break;
				}
				case 5:{
					stk.emptyQueue();
					System.out.println("!!Action Complete!!");
					break;
				}
				case 6:{
					stk.isEmpty();
					break;
				}
				
			}
		}
	}
}

	
