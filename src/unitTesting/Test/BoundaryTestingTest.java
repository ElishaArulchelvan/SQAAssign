package unitTesting.Test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unitTesting.BoundaryTesting;

public class BoundaryTestingTest {

	int[] maxBoundary = new int[10];
	int[] minBoundary = new int[1];
	
	@Test
	public void testMax() {
		
		BoundaryTesting bTest = new BoundaryTesting();
		assertEquals(10, bTest.makePizza(maxBoundary));
		
	}
	
	@Test
	public void testMin()
	{
		BoundaryTesting bTest = new BoundaryTesting();
		assertEquals(1, bTest.makePizza(minBoundary));
	}

}
