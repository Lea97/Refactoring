package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.Movie;

public class MovieTest {

	@Test
	public void getPriceCode() {
		int testPriceCode = 2;
		Movie testMovie = new Movie("Name", testPriceCode);
		assertEquals(testPriceCode, testMovie.getPriceCode());
	}

	@Test
	public void getTitle() {
		String testTitle = "TestTitle";
		Movie testMovie = new Movie(testTitle, 2);
		assertEquals(testTitle, testMovie.getTitle());
	}

	@Test
	public void setPriceCode() {
		int testPriceCode = 2;
		Movie testMovie = new Movie("Name", testPriceCode);
		assertEquals(testPriceCode, testMovie.getPriceCode());

		testMovie.setPriceCode(1);
		assertEquals(1, testMovie.getPriceCode());
	}

}
