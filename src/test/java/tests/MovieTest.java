package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.Movie;

public class MovieTest {

	@Test
	public void getPriceCode() {
		int testPrice = 10;
		Movie testMovie = new Movie("Name", testPrice);
		assertEquals(testPrice, testMovie.getPriceCode());
	}

	@Test
	public void getTitle() {
		String testTitle = "TestTitle";
		Movie testMovie = new Movie(testTitle, 5);
		assertEquals(testTitle, testMovie.getTitle());
	}

	@Test
	public void setPriceCode() {
		int testPrice = 10;
		Movie testMovie = new Movie("Name", testPrice);
		assertEquals(testPrice, testMovie.getPriceCode());

		testMovie.setPriceCode(12);
		assertEquals(12, testMovie.getPriceCode());
	}

}
