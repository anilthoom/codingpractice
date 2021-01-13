package com.anilt.problems;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) 
	{
		String str = "{[()])}";
		//String str = "{{[[(())]]}}";
		str = "}][}}(}][))]";
		System.out.println(isBalanced(str));
	}
	static String isBalanced(String s) 
	{
		Stack<String> stack = new Stack<String>();
		String bracket = "";
		for(int i =0; i<s.length(); i++)
		{
			bracket = ""+s.charAt(i);
			if( bracket.equals("{") || bracket.equals("[") || bracket.equals("("))
				stack.push(bracket);
			else if(!stack.isEmpty() && ( (bracket.equals(")") && stack.peek().equals("(")) || (bracket.equals("]") && stack.peek().equals("[")) || (bracket.equals("}") && stack.peek().equals("{"))) )
			{
				stack.pop();
			}
			else
			{
				return "NO";
			}
		}
		if(stack.isEmpty())
			return "YES";
		else
			return "NO";
    }
}
