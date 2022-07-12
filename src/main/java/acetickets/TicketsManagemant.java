package acetickets;

import java.util.Scanner;

import admin.adminMain;

import customer.Customermain;

public class TicketsManagemant {
	
	public void main()
	{
	
		
	}
	public static void main(String [] args)
	{
		while (true) {
		System.out.println("                          Book my Ticket");
		System.out.println("=============================================================================");
		System.out.println("                                 1)ADMIN                                     ");
		System.out.println("                                 2)CUSTOMER                                  ");
		System.out.println("                                 3)EXIT                                      ");
		System.out.println("=============================================================================");
		System.out.println("enter your choice");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: adminMain.admin();
		           break;
		case 2: Customermain.customer1();
		               break;
		case 3: System.exit(0);
	           break;
		default :System.err.println("enter correct input");
		}
		 
		//TicketsManagemant tm =new TicketsManagemant();
		//tm.main();
	}

}
}