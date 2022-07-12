package movie;
import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;



import Tickets.TicketsBlue;
import acetickets.TicketsManagemant;
import admin.adminMain;

public class MovieDAO {
	int x;
	static Scanner sc = new Scanner(System.in);
	static List <TicketsBlue> movie = new ArrayList();//original
	static List <TicketsBlue> temp= new ArrayList();
	TicketsBlue tickets=null;
	
	
	public void addMovie() {
		do
		{
			System.out.println("enter movie id 4 digit");
			String id= sc.next();//212
			
		while(!Pattern.matches("\\d{4}+", id))
		{
			System.err.println("enter valid 4 digit movie id");
			id= sc.next();
		}
		int id1=Integer.parseInt(id);
		
		System.out.println("Enter movie name");
		String name= sc.next();
		
		System.out.println("enter movie time");
		String Time1= sc.next();
	while(!Pattern.matches("\\d{1,2}"+":"+"\\d{1,2}", Time1))
	{
		System.err.println("enter valid 00:00 pattern digit movie time");
		Time1= sc.next();
	}
	//
	
	System.out.println("enter no of tickets for sale");
	String tickets = sc.next();
	while(!Pattern.matches("\\d{1,2}", tickets))
	{
		System.err.println("enter valid quantity of tickets 1 to 2 digits only");
		tickets =sc.next();
	}
	int tickets1= Integer.parseInt(tickets);
	//
	
	System.out.println("enter price of each ticket");
	String price = sc.next();
	while(!Pattern.matches("\\d{2,3}", price))
	{
		System.err.println("enter valid ticket price  2 to 3 digits only");
		price =sc.next();
	}
	int price1= Integer.parseInt(price);
	
	    movie.add(new TicketsBlue(id1, name, Time1, tickets1, price1));
		System.out.println("press 1 you dont want to repeat ");
		x= sc.nextInt();
		}while(x!=1);
		
		System.out.println("data inserted");
		
	}
	
	
	
	
	

	public void viewMovie() {
		// TODO Auto-generated method stub
		
		System.out.println("enter your movie name");
		String movieName1= sc.next();
		System.out.println("movieid  name  time   seats   price");
		List<TicketsBlue> c=movie.stream().filter(i ->(i.getMovieName()).equals(movieName1)).collect(Collectors.toList());
		c.stream().forEach(System.out::print);
		System.out.println();
		System.out.println();
	}
	
	public List<TicketsBlue> viewallMovies() {
		
		return movie;
	}

	
	public void updateMovie() {
		// TODO Auto-generated method stub
		temp= new ArrayList<TicketsBlue>();
		System.out.println("enter moviename to update");
		String id2 =sc.next();
		for(TicketsBlue t:movie)
		{
			if(t.getMovieName().equals(id2))
			{
				System.out.println("for update 1.movieName 2.movieTime 3.numbertOfTickets 4.price");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
						System.out.println("enter the movename to update");
						t.setMovieName(sc.next());
						break;
				case 2:
						System.out.println("enter movie Time to update");
						String Time1= sc.next();
						while(!Pattern.matches("\\d{1,2}"+":"+"\\d{1,2}", Time1))
						{
							System.out.println("enter valid 00:00 pattern digit movie time");
							Time1= sc.next();
						}
					t.setTime(Time1);
					break;
						
				case 3:
					System.out.println("enter the no of movie tickets to udate");
					String tickets = sc.next();
					while(!Pattern.matches("\\d{1,2}", tickets))
					{
						System.out.println("enter valid quantity of tickets 1 to 2 digits only");
						tickets =sc.next();
					}
					int tickets1= Integer.parseInt(tickets);
					t.setNumberOfTickets(tickets1);
					break;
					
			   case 4:
				   System.out.println("enter  the price to update");
				   String price = sc.next();
					while(!Pattern.matches("\\d{2,3}", price))
					{
						System.out.println("enter valid ticket price  2 to 3 digits only");
						price =sc.next();
					}
					int price1= Integer.parseInt(price);
				    t.setPrice(price1);
				    break;
				
			   default :
					 System.out.println("enter valid number you want to update");
					
				}
				temp.add(t);
			}
			
			else
			{
				temp.add(t);
			}
		}
		
		movie = new ArrayList<TicketsBlue>();
		for( TicketsBlue b:temp)
		{
			movie.add(b);
		}
		
	System.out.println("data updated");
		
	}

	public void deleteMovie() {
		temp= new ArrayList<TicketsBlue>();
		System.out.println("enter movie name");
		String movie1= sc.next();
		for(TicketsBlue t:movie)
		{
			if(t.getMovieName().equals(movie1))
			{
				System.out.println("deleted");  
			}
			else 
				{
					temp.add(t);
				}
			}
		movie = new ArrayList<TicketsBlue>();
		for( TicketsBlue b:temp)
		{
			movie.add(b);
		}
		System.out.println("data updated");
		}

	
	
	public void bookMovieTicket() {
		temp = new ArrayList<TicketsBlue>();
		for (TicketsBlue p4 : movie) {
			System.out.println(p4);
		}
		System.out.println("enter id to book the tickets");
		int id1= sc.nextInt();
		System.out.println("enter no of tickets you want");
		int tickets=sc.nextInt();
		for (TicketsBlue b :movie) {
			if (b.getMovieId() == id1) {
	
				System.out.println("");
				System.out.println("");
		System.out.println("==================================================================================");
		System.out.println("************************************BILL******************************************");
		System.out.println("==================================================================================");
		System.out.println("movie Id                               ="+b.getMovieId());
		System.out.println("movie name                             ="+b.getMovieName());
		System.out.println("time                                  ="+b.getTime()                              );
		System.out.println("no of tickets                         ="+b.getNumberOfTickets()                                  );
		System.out.println("price for 1 ticket                    ="+b.getPrice());
		System.out.println("==================================================================================");
		System.out.println("total                                 ="+(b.getPrice()*tickets));
		b.setNumberOfTickets((b.getNumberOfTickets()-tickets));
		temp.add(b);
		System.out.println("");
	}
			else
			{
				temp.add(b);
			}
			}
		movie = new ArrayList<TicketsBlue>();
		for(TicketsBlue s:temp)
		{
			movie.add(s);
		}
		
		System.out.println("THANK YOU VISIT AGAIN");
		
	}

	public void CancelTicket() {
		temp= new ArrayList<TicketsBlue>();
		System.out.println("enter movidid to cancel");
		int id1= sc.nextInt();
		
		Collection<TicketsBlue>  same =  movie.stream().filter(i ->(i.getMovieId()==id1)).collect(Collectors.toList());
		System.out.println("enter no of tickets you cancel");
		int tickets=sc.nextInt();
		for(TicketsBlue b:same)
		{
		System.out.println("==================================================================================");
		System.out.println("************************************calcilled bill******************************************");
		System.out.println("==================================================================================");
		System.out.println("movieId                               ="+b.getMovieId());
		System.out.println("moviename                             ="+b.getMovieName());
		System.out.println("time                                  ="+b.getTime());
		System.out.println("no of tickets to cancel               ="+tickets                 );
		System.out.println("price for 1 ticket                    ="+b.getPrice());
		System.out.println("==================================================================================");
		System.out.println("total    refundamount                 ="+(b.getPrice()*tickets));
		b.setNumberOfTickets((b.getNumberOfTickets()+tickets));
		temp.add(b);
		}
		
		
		movie = new ArrayList<TicketsBlue>();
		for(TicketsBlue s:temp)
		{
			movie.add(s);
		}
	
		System.out.println("THANK YOU VISIT AGAIN");
		
	}

	public void back() {
		// TODO Auto-generated method stub
		new TicketsManagemant().main();
	}



}
