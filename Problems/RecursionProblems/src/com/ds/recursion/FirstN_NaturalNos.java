package com.ds.recursion;

//Write code to print first N natural nos

public class FirstN_NaturalNos {

	public static void print(int n)
	{
		if( n == 0)
		return;
		
		print(n-1);
		System.out.print(n+ " ");
	
	}
	public static void main(String[] args) {
		print(5);
	}

}
