package unitTesting.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unitTesting.BoundaryTesting;

public class BoundaryTestingTest {

	@Test
	public void testMain() {
		
		BoundaryTesting bTest = new BoundaryTesting();
		bTest.makePizza(-20);
		
	}

}
