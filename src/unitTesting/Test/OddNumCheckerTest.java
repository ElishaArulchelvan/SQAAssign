package unitTesting.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unitTesting.OddNumChecker;

public class OddNumCheckerTest {

	@Test
	public void testIsOdd() {
		
		OddNumChecker checker = new OddNumChecker();
		int num = 3;
		Boolean result = checker.isOdd(num);
		assertEquals(result, new Boolean(true));
	}

	
	@Test
	public void testForEven() //This test will fail
	{
		OddNumChecker checker = new OddNumChecker();
		int num = 2;
		Boolean result = checker.isOdd(num);
		assertEquals(result, new Boolean(true));
	}
}
