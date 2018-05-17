package Program;

import java.util.*;

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();
	private StringBuilder result = new StringBuilder();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.addElement(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		result.append("Rental Record for " + this.getName() + "\n");
		result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

		for (Enumeration enum_rentals = rentals.elements(); enum_rentals.hasMoreElements();) {
			Rental rental = (Rental) enum_rentals.nextElement();
			double thisAmount = 0;

			thisAmount = rental.getMovie().getPrice().getAmount(rental.getDaysRented());
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((rental.getMovie().getPrice().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental
			result.append("\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t"
					+ String.valueOf(thisAmount) + "\n");
			totalAmount += thisAmount;
		}

		// add footer lines
		result.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
		result.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
		return result.toString();
	}

}
