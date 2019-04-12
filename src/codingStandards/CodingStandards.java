package codingStandards;

import java.util.Date;

public class CodingStandards {
	
	private String firstName;
	private String surName;
	private Date dob;
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getSurName() 
	{
		return surName;
	}
	
	public void setSurName(String surName) 
	{
		this.surName = surName;
	}
	
	public Date getDob() 
	{
		return dob;
	}
	
	public void setDob(Date dob) 
	{
		this.dob = dob;
	}
	
	public static void main(String args[])
	{
		int num = 0;
		if(num <= 10)
		{
			System.out.println("The number you picked is between 1 and 10");
		}
		
	}
	
	public boolean getUser()
	{
		String firstName = null;
		
		if(firstName.isEmpty())
		{
			return false;
		}
		else
		{
			System.out.println("The user is " + firstName);
		}
		
		return true;
			
	}
	
	

}
