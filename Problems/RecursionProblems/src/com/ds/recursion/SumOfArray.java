package com.ds.recursion;

import java.util.Scanner;

/*
 * Given an array of length N, 
 * you need to find and return the sum of all elements of the array.
 */
public class SumOfArray {

	public static int sum(int arr[]) //using small or new arr
	{
		if(arr.length <=0)
			return -1;
		
		if(arr.length == 1)
			return arr[0];
		
		int[] newArr = new int[arr.length - 1];
		for(int i = 1; i<arr.length ; i++)
			newArr[i-1] = arr[i];
		
		int ans = arr[0] + sum(newArr);
		return ans;
		
	}
	
	public static int sum(int[] arr , int si)
	{
		if(si < 0)
			return 0;
		
		if(si == arr.length)
			return 0;
		
		int ans = arr[si] + sum(arr, si+1);
		return ans;
		
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println(sum(arr));
		System.out.println(sum(arr, -1));

	}

}
