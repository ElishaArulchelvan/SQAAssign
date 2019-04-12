package unitTesting;

public class primeNum {
	
	//number is prime if it can only be divided by 1 and itself
	
	public boolean isPrime(int n)
	{
		//% divides and gives you remainder
		if(n%2 == 0 && n !=2)
		{
			return false;
		}
		for(int i=3; i*i <= n; i+=2)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	
	
	

}
