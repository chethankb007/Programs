package com.ds.recursion;

import java.util.Scanner;
/*
 * Given an array of length N and an integer x, you need to find if x is present in the array or not. 
 * Return true or false.
 */

public class CheckNumberInArray {
	public static boolean checkNumber(int input[], int x)//using temp array
	{
		if(input.length == 0)
			return false;
		
		if(input[0] == x)
			return true;
		
		int newArr[] = new int[input.length - 1];
		for(int i = 1; i<input.length;i++)
			newArr[i-1] = input[i];
		
		boolean ans = checkNumber(newArr, x);
		return ans;
		
	}
	public static boolean checkNumberusingSI(int arr[], int si,int x)
	{
		if(si == arr.length)
			return false;
		
		if(arr[si] == x)
			return true;
		
		boolean ans = checkNumberusingSI(arr, si+1, x);
		return ans;
	}
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println("Enter number to be checked");
		int num =s.nextInt();
		System.out.println(checkNumberusingSI(arr, 0, num));
		
	}

}
