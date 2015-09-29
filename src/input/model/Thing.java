package input.model;

import javax.swing.JOptionPane;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	public Thing()
	{
		age = -99;
		weight = -.0000005;
		name = "";
	}
	
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.weight = weight;
		this.name = name;
		
	}
	
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old and weighs "+ weight;
		
		return thingInfo;
	}
	
}
