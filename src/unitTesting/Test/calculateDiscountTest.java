package unitTesting.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unitTesting.calculateDiscount;

public class calculateDiscountTest {

	@Test
	public void testCalculateDiscount() {
		
		calculateDiscount pTest = new calculateDiscount();
		double d = pTest.calculateDiscount(0.1);
		assertEquals(18,18);
	}
	
	

}
