package Program;

public class PriceFactory {

	public Price getPrice(int priceCode) {
		
		if (priceCode == Movie.CHILDRENS) 
		{
			return new ChildrenPrice();
		}
		
		if (priceCode == Movie.REGULAR) 
		{
			return new RegularPrice();
		}
		
		if (priceCode == Movie.NEW_RELEASE)
		{
			return new NewReleasePrice();
		} 
		
		else 
		{
			throw new IllegalArgumentException("Price Code does not exist");
		}
	}

}
