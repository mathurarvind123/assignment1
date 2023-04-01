package assignment;

public class Main_movie {
	public static void main(String[] args) {
		Movie m=new Movie(); // creating object for Movie
// setting values
	m.setMovieName("Black Panther");
	m.setMovieStartTime(5);
	m.setMovieEndTime(7);
	m.setMovieTicketPrice(350);
// getting values
	System.out.println("Movie name: "+m.getMovieName());
	System.out.println("Movie start time: "+m.getMovieStartTime()+" pm");
	System.out.println("Movie end time: "+m.getMovieEndTime()+" pm");
	System.out.println("Movie ticket price: Rs."+m.getMovieTicketPrice());
	}
}
}
