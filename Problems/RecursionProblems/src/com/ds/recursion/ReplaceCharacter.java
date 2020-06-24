package com.ds.recursion;

public class ReplaceCharacter {
	public static String replaceChar(String s , char a ,  char b)
	{
		if(s.length() == 0)
			return s;
		
		String smallOutput = replaceChar(s.substring(1), a, b);
		if(s.charAt(0) == a)
			return b + smallOutput;
		else
			return s.charAt(0) + smallOutput;
		
	}

	public static String removeX(String s, char x)
	{
		if(s.length() == 0)
			return s;
		String smallOutput = removeX(s.substring(1), x);
		if(s.charAt(0) == x)
			return smallOutput;
		else
			return s.charAt(0) + smallOutput;
	}
	public static String replacePI(String s)
	{
		if(s.length() == 0)
			return s;
	
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i')
			return "3.14"+replacePI(s.substring(2));
		else
			return s.charAt(0) + replacePI(s.substring(1));
	}
	public static String removeConsecutiveDuplicates(String s)
	{
		if(s.length() <= 1)
			return s;
	
		if(s.charAt(0) == s.charAt(1))
			return  removeConsecutiveDuplicates(s.substring(1));
		else
			return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
	}
	public static void main(String[] args) {
	//	System.out.println(replaceChar("abxcxdxc",'x', 'y'));
		//System.out.println(removeX("axbxxcxdx", 'x'));
		//System.out.println(replacePI("apipi"));
		System.out.println(removeConsecutiveDuplicates("aaaaaaaaaaaaaabcddddefghh"));
	}

}
