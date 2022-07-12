package customer;

import java.util.List;
import java.util.Scanner;

import Tickets.TicketsBlue;
import admin.adminMain;
import movie.MovieDAO;

public class Customermain {
	static MovieDAO d= new MovieDAO();
	static Customermain c= new Customermain();

	public static void customer1()
	{
		System.out.println("=============================================================================");
		System.out.println("                                 CUSTOMER                                      ");
		System.out.println("=============================================================================");
		System.out.println("                                 1)viewMovie                                 ");
		System.out.println("                                 2)viewAllMovies                             ");
		System.out.println("                                 3)bookMovieTicket                           ");
		System.out.println("                                 4)cancelMovieTicket                         ");
		System.out.println("                                 5)back                                      ");
		System.out.println("=============================================================================");
		System.out.println("enter your choice");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();

		
		switch(choice)
		{
			case 1:
					d.viewMovie();
					customer1();
					break;
			  
			
			case 2:
					List <TicketsBlue> tic= d.viewallMovies();
					for(TicketsBlue t:tic)
					{
						System.out.println(t.getMovieId()+"\t"+t.getMovieName()+"\t"+t.getTime()+"\t"+t.getNumberOfTickets()+"\t"+t.getPrice()+"\n");
					}
					customer1();
					break;
					
			case 3:
					d.bookMovieTicket();
					customer1();
					break;
					
			case 4:
				 	d.CancelTicket();
				 	customer1();
				 	break;
				
			case 5:
					d.back();
					break;
					
			default:
				System.out.println("enter valid input");
				customer1();
				d.back();
				 	
				 	
		}
	}


	}




