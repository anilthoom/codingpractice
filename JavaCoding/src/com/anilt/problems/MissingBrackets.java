package com.anilt.problems;

import java.util.EmptyStackException;
import java.util.Stack;

public class MissingBrackets {

	public static void main(String[] args) 
	{
		String input = "[()]{}{[()()]()}[] {";
		Stack<String> bracketsStack = new Stack<String>();
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			if(c=='[' || c=='(' || c=='{')
				bracketsStack.push(""+c);
			else
			{
				try 
				{
					String openBracket = bracketsStack.pop();
					boolean isValid = isValidClose(openBracket, ""+c);
					if(!isValid)
					{
						System.out.println("Invalid Expression At Index : "+i);
						break;
					}
				}
				catch (EmptyStackException e) 
				{
					System.out.println("Invalid Expression");
					break;
				}
			}
		}
		System.out.println("Valid expression : "+bracketsStack.size());
	}
	static boolean isValidClose(String open, String close)
	{
		if(open.equals("(") && close.equals(")"))
		{
			return true;
		}
		else if(open.equals("[") && close.equals("]"))
		{
			return true;
		}
		else if(open.equals("{") && close.equals("}"))
		{
			return true;
		}
		else
		{
			//PROBLEM
			return false;
		}
	}
}
