package movie;
import java.util.List;

import Tickets.TicketsBlue;
public interface TicketsDAO {
	public void addMovie();
	public TicketsBlue viewMovie();
	public List<TicketsBlue> viewallMovies();
	public void updateMovie();
	public void deleteMovie();
	public void bookMovieTicket();
	public void CancelTicket();
	public void back();
}
