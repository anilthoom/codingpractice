package com.anilt.problems.stringmanipulation;

public class StringReverse {

	public static void main(String[] args) 
	{
		System.out.println(1-2);
		StringReverse sr = new StringReverse();
		String str = "ABTCTD EFTGH IJTKL MNOP QRST";
		sr.printReverseConditional(str);
//		sr.printReverse(str);
//		sr.printReverseSB(str);
	}
	//Print words in reverse if the words have 't' occurring one time or 3 times in them
	void printReverseConditional(String sentence)
	{
		StringBuilder sb = new StringBuilder();
		String words[] = sentence.split(" ");
		for (String word : words) 
		{
			int count =0;
			for(int i=0; i<word.length(); i++)
			{
				if((""+word.charAt(i)).equalsIgnoreCase("T"))
					count++;
			}
			if(count ==1 || count ==3)
				System.out.println("Reverse of : "+word+" is : "+new StringBuilder(word).reverse());
		}
	}
	void printReverse(String str)
	{
		String reverseStr = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverseStr += str.charAt(i)+"";
		}
		System.out.println(reverseStr);
	}
	void printReverseSB(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());
	}
}
