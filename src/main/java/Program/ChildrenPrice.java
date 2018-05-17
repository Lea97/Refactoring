package Program;

public class ChildrenPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	double getAmount(int dayRented) {
		double amount = 1.5;
		if (dayRented > 3) {
			amount += (dayRented - 3) * 1.5;
		}
		return amount;
	}

}
