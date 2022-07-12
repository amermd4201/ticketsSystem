package admin;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import Tickets.TicketsBlue;
import movie.MovieDAO;

public class adminMain {
	static MovieDAO d = new MovieDAO();//has relation
	static adminMain a = new adminMain();
	
public static void admin()
{
	System.out.println("=============================================================================");
	System.out.println("                                 ADMIN                                       ");
	System.out.println("=============================================================================");
	System.out.println("                                 1)add Movie                                  ");
	System.out.println("                                 2)view Movie                                 ");
	System.out.println("                                 3)view All Movies                             ");
	System.out.println("                                 4)update Movie                               ");
	System.out.println("                                 5)delete Movie                               ");
	System.out.println("                                 6)back                                      ");
	System.out.println("=============================================================================");
	System.out.println("enter your choice");
	Scanner sc= new Scanner(System.in);
	int choice = sc.nextInt();

	
	switch(choice)
	{
		case 1:
				d.addMovie();
				admin();
				break;
		  
		case 2:  
			d.viewMovie();
			admin();
			break;
		
		case 3:
				List <TicketsBlue> tic1= d.viewallMovies();
				for(TicketsBlue t:tic1)
				{
					System.out.println(t.getMovieId()+"\t"+t.getMovieName()+"\t"+t.getTime()+"\t"+t.getNumberOfTickets()+"\t"+t.getPrice()+"\n");
				}
				admin();		
				break;
				
		case 4:
				d.updateMovie();
				admin();		
				break;
				
		case 5:
			 	d.deleteMovie();
			 	admin();			
			 	break;
			
		case 6:
				d.back();
				break;
				
		default:
			d.back();
			 	
			 	
	}
}
	
	
}

