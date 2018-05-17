package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Program.Movie;
import Program.Rental;

public class RentalTest {

	@Test
	public void testGetDaysRented() {

		Rental rentalTest = new Rental(new Movie("title", 5), 10);
		assertEquals(10, rentalTest.getDaysRented());
	}

	@Test
	public void testGetMovie() {

		Rental rentalTest = new Rental(new Movie("title", 5), 10);
		assertEquals("title", rentalTest.getMovie().getTitle());
		assertEquals(5, rentalTest.getMovie().getPriceCode());
	}

}
