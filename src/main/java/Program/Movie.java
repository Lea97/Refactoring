package Program;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		PriceFactory priceFactory = new PriceFactory();
		this.price = priceFactory.getPrice(priceCode);
	}

	public Price getPrice() {
		return price;
	}

	public void setPriceCode(int priceCode) {
		PriceFactory priceFactory = new PriceFactory();
		this.price = priceFactory.getPrice(priceCode);
	}

	public String getTitle() {
		return title;
	}
}