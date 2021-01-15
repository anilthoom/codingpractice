package com.anilt.java.features;

public class AbstractClass extends AbstractTest
{

	public static void main(String[] args) 
	{
		String name = "Anil";
		name += " Kumar";
		System.out.println(name);
	}

	@Override
	void intef() 
	{
		// TODO Auto-generated method stub
		
	}

}
abstract class AbstractTest 
{
	public void method1()
	{
		System.out.println("method1");
	}
	abstract void intef();
}