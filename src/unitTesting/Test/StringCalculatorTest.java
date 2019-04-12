package unitTesting.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import unitTesting.StringCalculator;

public class StringCalculatorTest {

	
	@Test(expected = Exception.class)
	public void testNegativeInput()
	{
		StringCalculator calc = new StringCalculator();
		calc.add("-1");
		//this test passes because exception was thrown
	}
	
	@Test
	public void testString()
	{
		StringCalculator calc = new StringCalculator();
		calc.add("b");
		//this test fails becasue it is not a number
	}

}
