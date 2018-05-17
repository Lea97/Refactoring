package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.Customer;

public class CustomerTest {
	
	@Test
	public void testGetCustomerName()
	{
		String name = "TestName";
		Customer testCustomer = new Customer(name);
		assertEquals(name, testCustomer.getName());
	}
	
	

}
