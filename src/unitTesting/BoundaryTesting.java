package unitTesting;

import java.util.Scanner;

public class BoundaryTesting {
	
	/*private static int num;
	
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public static void main(String args[])
	{
		
		System.out.println("Max pizzas you can order is 10");
		System.out.println("How many pizzas do you want?");
		
		//Scanner inp= new Scanner(System.in);
		//int num;
		//num = inp.nextInt();
		if(num <=10)
		{
			System.out.println("Youve ordered " + num + " pizzas");
		}
		else
		{
			System.out.println("You can order that number of pizzas");
		}
	} */
	
	public void makePizza(int number) throws IllegalArgumentException
	{
		System.out.println("Max pizzas you can order is 10");
		System.out.println("How many pizzas do you want?");
		
		if(number <=10 )
		{
			System.out.println("Youve ordered " + number + " pizzas");
		}
		else if(number >=1)
		{
			System.out.println("Youve ordered " + number + " pizzas");
		}
		else
		{
			System.out.println("You can order that number of pizzas");
		}
	}

}
