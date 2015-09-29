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
		String tempAge = myPopups.getAnswer("How old are you");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Type in an integer value!");
		}
		
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
		String tempWeight = myPopups.getAnswer("What is your weight");

		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Give me a valid double value!!");
		}
		
		
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
		
		myPopups.displayResponse(myThing.toString());
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
			
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid interger");
		}
		
		return isInt;
	}
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			Double validDouble = Double.parseDouble(input);
			isDouble = true;
			
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid interger");
		}
		
		return isDouble;
	}
}
