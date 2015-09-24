package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("You typed in " + name);
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -1234567;
		}
		
		myPopups.displayResponse("You typed in " + age);
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your age");

		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble((tempWeight));
		}
		else
		{
			weight = -.9999000001;
		}
		
		myPopups.displayResponse("You typed in " + weight);
		
		
		myThing = new Thing(name, age, weight);
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid interger");
		}
		
		return isInt;
	}
	private boolean isDouble(String input)
	{
		boolean isInt = false;
		
		try
		{
			Double validDouble = Double.parseDouble(input);
			
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid interger");
		}
		
		return isInt;
	}
}
