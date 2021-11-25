package empSLLmenuderivven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkList ll =new LinkList();
		Scanner scn =new Scanner(System.in);
		boolean b=true;
		while(b) {
			showMenu();
			int chs =scn.nextInt();
			switch(chs) {
			case 1:{
				System.out.println("Enter data");
				Employee e =readEmp(scn);
				ll.insert(e);
				break;
			}
			case 2:{
				System.out.println("Enter data");
				Employee e =readEmp(scn);
				ll.append(e);
				break;
			}
			case 3:{
				ll.deletFirst();
				System.out.println("First data deleted");
				break;
			}
			case 4:{
				ll.deletLast();
				System.out.println("Last data deleted");
				break;
			}
			case 5:{
				System.out.println("Enter pos and data");
				Employee e =readEmp(scn);
				int pos =scn.nextInt();
				ll.insertAtPos(e, pos);
				break;
			}
			case 6:{
				System.out.println("Enter pos to delete");
				int pos1 =scn.nextInt();
				ll.delAtPos(pos1);
				break;
			}
			case 7:{
				System.out.println(ll);
				break;
			}
			case 8:{
				ll.revNode();
				System.out.println(ll);
				break;
			}
			case 9:{
				System.out.println("Enter emp id:");
				int id =scn.nextInt();
				ll.empById(id);
				break;
			}
			case 10:{
				ll.empWithHighSal();
				break;
			}
			case 11:{
				ll.empWithA();
				break;
			}
			case 12:{
				ll.delList();
				break;
			}
			case 0:
				b=false;
				break;
			default:
				System.out.println("Wrong option");
				break;
			}
		}
	}
	private static Employee readEmp(Scanner scn) {
		System.out.println("Enter name:");
		String nm =scn.next();
		System.out.println("Enter Id:");
		int id =scn.nextInt();
		System.out.println("Enter Sal:");
		int sal=scn.nextInt();

		Employee e =new Employee(nm,id,sal);
		return e;
	}

	private static void showMenu() {
		System.out.println("Press 1 to Insert in front\nPress 2 for Insert last");
		System.out.println("Press 3 to delet in front\nPress 4 for delete last");
		System.out.println("Press 5 to Insert at Given Position\nPress 6 for Delete at given position");
		System.out.println("Press 7 to Print list\nPress 8 for Reverse list");
		System.out.println("Press 9 to print employee details by id");
		System.out.println("Press 10 to print all Emp with sal > 2000");
		System.out.println("Press 11 to print all Emp name start with letter 'a' ");
		System.out.println("Press 12 to delete empty list");

		System.out.println("Press 0 to Exit");

	}


}



