package Program;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	double getAmount(int dayRented) {
		double amount = 2;
		if (dayRented > 2) {
			amount += (dayRented - 2) * 1.5;
		}
		return amount;
	}

}
