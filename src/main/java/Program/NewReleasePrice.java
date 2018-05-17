package Program;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	double getAmount(int dayRented) {
		return dayRented * 3;
	}

}
