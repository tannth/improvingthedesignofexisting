package chap1.afterrefector;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	Price _price;

	public Movie(String _title, int _priceCode) {
		this._title = _title;
		setPriceCode(_priceCode);
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String _title) {
		this._title = _title;
	}

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}

	int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}

}
