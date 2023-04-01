package assignment;

public class Movie {
	// instance variables
		private String movieName;
		private double movieStartTime;
		private double movieEndTime;
		private float movieTicketPrice;
		
	// generating getter and setter method
		public double getMovieTicketPrice() {
			return movieTicketPrice;
		}
		public void setMovieTicketPrice(float movieTicketPrice) {
			this.movieTicketPrice = movieTicketPrice;
		}
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public double getMovieStartTime() {
			return movieStartTime;
		}
		public void setMovieStartTime(double movieStartTime) {
			this.movieStartTime = movieStartTime;
		}
		public double getMovieEndTime() {
			return movieEndTime;
		}
		public void setMovieEndTime(double movieEndTime) {
			this.movieEndTime = movieEndTime;
		}
}
