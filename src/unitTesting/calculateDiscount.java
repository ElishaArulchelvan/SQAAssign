package unitTesting;

public class calculateDiscount {
	
	public double calculateDiscount(double d)
	{
		int price = 20;
		//double d = 0;
		
		
		if(d == 0.1)
		{
			double cost = price + (price / d);
			return cost;
			
		}
		else if(d == 0.2){
			
			double cost = price + (price /d);
			return cost;
		}
		return price;
		
	}

}
