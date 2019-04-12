package unitTesting;

import java.util.Scanner;

public class BoundaryTesting {
	
	
	public void makePizza(int[] pizzas) throws IllegalArgumentException
	{
		System.out.println("Max pizzas you can order is 10");
		System.out.println("How many pizzas do you want?");
		
		int inputPizza = 0;
		
		int max = 10;
		int min = 1;
		
		if(pizzas.length <= max || pizzas.length >= min)
		{
			System.out.println(pizzas.length + "pizzas ordered");
		}
		System.out.println(inputPizza + "not right amount of pizzas ordered");
		
		
	}

}
