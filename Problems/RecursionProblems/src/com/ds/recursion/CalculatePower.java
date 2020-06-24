package com.ds.recursion;

import java.util.Scanner;

//Program to find x to the power n (i.e. x^n). 
//Take x and n from the user. You need to return the answer.


public class CalculatePower {
	
	public static int power(int x, int n) 
	{
		if(x == 0 && n == 0)
			return 1;
		if(n == 0)
			return 1;
		if(x == 0)
			return 0;
		
		int smallans = power(x,n/2);
		if(n % 2 == 0)
			return smallans * smallans;
		
		return x * smallans * smallans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x :");
		int x = s.nextInt();
		
		System.out.println("Enter the value of n :");
		int n = s.nextInt();
		
		System.out.println(power(x, n));
		s.close();
	}

}
