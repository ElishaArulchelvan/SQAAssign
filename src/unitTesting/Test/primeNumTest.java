package unitTesting.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unitTesting.primeNum;

public class primeNumTest {

	@Test
	public void testIsPrime() {
		
		primeNum intP = new primeNum();
		boolean result = intP.isPrime(5);
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testNum2() //checks the if statement works by testing number 2
	{
		primeNum intP = new primeNum();
		boolean result = intP.isPrime(2);
		boolean expected = true;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testNotPrime() // checks that the if and for loop works 
	{
		primeNum intP = new primeNum();
		boolean result = intP.isPrime(4);
		boolean expected = true;
		
		assertEquals(expected, result);
		//This test will fail as 4 is not a prime number
	}
	
	

}
