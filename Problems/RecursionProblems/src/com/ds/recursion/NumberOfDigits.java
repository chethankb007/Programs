package com.ds.recursion;

import java.util.Scanner;

/*
 *Write  code to find out and return the number of digits present in a number recursively
 */
public class NumberOfDigits {
public static int count(int num)
{
	if(num == 0)
		return 0;
	int smallans = count(num/10);
		
	return 1 + smallans;
	
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(count(n));
		s.close();
	}

}
