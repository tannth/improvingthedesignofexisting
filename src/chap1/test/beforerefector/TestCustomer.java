package chap1.test.beforerefector;

import org.junit.Before;
import org.junit.Test;

import chap1.beforerefector.Customer;
import chap1.beforerefector.Movie;
import chap1.beforerefector.Rental;
import static org.junit.Assert.*;
public class TestCustomer {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private Customer customer1;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testPriceCodeRegular(){
		Movie m1 = new Movie("Doi Bong Thieu Lam", REGULAR);
		Rental r1 = new Rental(m1,2);
		Rental r2 = new Rental(m1,3);
		customer1 = new Customer("Tân");
		customer1.addRental(r1);
		customer1.addRental(r2);
		
		String result1 = "Rental Record for " + customer1.getName() + "\n";
		result1 += "\t" + "Doi Bong Thieu Lam"+ "\t" + "2.0" + "\n";
		result1 += "\t" + "Doi Bong Thieu Lam"+ "\t" + "3.5" + "\n";
		result1 += "Amount owed is " + "5.5" + "\n";
		result1 += "You earned " + "2"	+ " frequent renter points";
		assertEquals(result1, customer1.statement());
	}
	
	@Test
	public void testPriceCodenNewRelease(){
		Movie m1 = new Movie("Doi Bong Thieu Lam", NEW_RELEASE);
		Rental r1 = new Rental(m1,1);
		Rental r2 = new Rental(m1,4);
		customer1 = new Customer("Tân");
		customer1.addRental(r1);
		customer1.addRental(r2);
		
		String result1 = "Rental Record for " + customer1.getName() + "\n";
		result1 += "\t" + "Doi Bong Thieu Lam"+ "\t" + "-3.0" + "\n";
		result1 += "\t" + "Doi Bong Thieu Lam"+ "\t" + "6.0" + "\n";
		result1 += "Amount owed is " + "3.0" + "\n";
		result1 += "You earned " + "3"	+ " frequent renter points";
		assertEquals(result1, customer1.statement());
	}
	
	@Test
	public void testPriceCodenChidrens(){
		Movie m1 = new Movie("Doi Bong Thieu Lam", CHILDRENS);
		Rental r1 = new Rental(m1,1);
		Rental r2 = new Rental(m1,4);
		customer1 = new Customer("Tân");
		customer1.addRental(r1);
		customer1.addRental(r2);
		
		String result1 = "Rental Record for " + customer1.getName() + "\n";
		result1 += "\t" + "Doi Bong Thieu Lam"+ "\t" + "1.5" + "\n";
		result1 += "\t" + "Doi Bong Thieu Lam"+ "\t" + "3.0" + "\n";
		result1 += "Amount owed is " + "4.5" + "\n";
		result1 += "You earned " + "2"	+ " frequent renter points";
		assertEquals(result1, customer1.statement());
	}

}
