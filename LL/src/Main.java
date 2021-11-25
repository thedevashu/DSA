import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll =new LinkList();
		Scanner scn =new Scanner(System.in);
		boolean b=true;
		while(b) {
			System.out.println("Press 1 to Insert in front\nPress 2 for Insert last");
			System.out.println("Press 3 to delet in front\nPress 4 for delete last");
			System.out.println("Press 5 to Insert at Given Position\nPress 6 for Delete at given position");
			System.out.println("Press 7 to Print list\nPress 8 for Reverse list");
			System.out.println("Press 0 to Exit");

			int chs =scn.nextInt();

			switch(chs) {
			case 1:
				System.out.println("Enter data");
				int d1 =scn.nextInt();
				ll.insert(d1);
				break;
			case 2:
				System.out.println("Enter data");
				int d2 =scn.nextInt();
				ll.append(d2);break;
			case 3:
				ll.deletFirst();
				System.out.println("First data deleted");
				break;
			case 4:
				ll.deletLast();
				System.out.println("Last data deleted");break;
			case 5:
				System.out.println("Enter pos and data");
				int pos =scn.nextInt();
				int d3 =scn.nextInt();
				ll.insertAtPos(d3, pos);break;

			case 6:
				System.out.println("Enter pos to delete");
				int pos1 =scn.nextInt();
				ll.delAtPos(pos1);break;
			case 7:
				System.out.println(ll);
				break;
			case 8:
				ll.revNode();
				System.out.println(ll);break;

			case 0:
				b=false;break;

			default:
				System.out.println("Wrong option");
				break;


			}
		}


	}

}
