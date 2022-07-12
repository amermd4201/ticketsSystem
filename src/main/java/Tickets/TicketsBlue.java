package Tickets;

public class TicketsBlue {

public TicketsBlue(int movieId, String movieName, String time, int numberOfTickets, int price) {
		super();
		 MovieId = movieId;
		MovieName = movieName;
		Time = time;
		this.numberOfTickets = numberOfTickets;
		this.price = price;
	}
private int MovieId;
public int getMovieId() {
	return MovieId;
}
public void setMovieId(int ticketId) {
	MovieId = ticketId;
}
public String getMovieName() {
	return MovieName;
}
public void setMovieName(String movieName) {
	MovieName = movieName;
}
public String getTime() {
	return Time;
}
public void setTime(String time) {
	Time = time;
}
public int getNumberOfTickets() {
	return numberOfTickets;
}
public void setNumberOfTickets(int numberOfTickets) {
	this.numberOfTickets = numberOfTickets;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
private String MovieName;
private String Time;
private int numberOfTickets;
private int price;

public String toString()
{
	return MovieId+"\t"+MovieName+"\t"+Time+"\t"+numberOfTickets+"\t"+price;
	
}

}
