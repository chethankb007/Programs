package com.ds.recursion;

public class FibonacciNumber {
	
	public static int fib(int n)
	{
		
		if(n == 1 ||  n == 2)
			return 1;
		int fibn_1 = fib(n - 1);
		int fibn_2 = fib(n - 2);
		
		int output = fibn_1 + fibn_2;
		return output;
	}

	public static void main(String[] args) {

		System.out.println(fib(99));
	}

}
