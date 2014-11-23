package chap1.afterrefector;

public class Rental {
	Movie _movie;
	private int _dayRented;

	public Rental(Movie _movie, int _dayRented) {
		this._movie = _movie;
		this._dayRented = _dayRented;
	}

	public Movie getMovie() {
		return _movie;
	}
	
	public void setMovie(Movie _movie) {
		this._movie = _movie;
	}
	public int getDayRented() {
		return _dayRented;
	}
	public void setDayRented(int _dayRented) {
		this._dayRented = _dayRented;
	}
	
	double getCharge() {
		return _movie.getCharge(_dayRented);
	}
	
	double getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_dayRented);
	}
	
}
