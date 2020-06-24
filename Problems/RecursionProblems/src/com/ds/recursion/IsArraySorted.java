package com.ds.recursion;

import java.util.Scanner;
/*
 * write code to check given array is sorted ,Write recursively
 */

public class IsArraySorted {
	
	public static boolean isArraySorted(int[] arr)// using small aarray
	{
		if(arr.length == 1)
			return true;
		
		if(arr[0] > arr[1])
		return false;
		
		int[] newarr = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++)
			newarr[i-1] = arr[i];
		
		boolean ans = isArraySorted(newarr);
		return ans;
		
	}

	public static boolean isArraySortedusingSI(int[] arr, int si)//using startIndex
	{
		
					
		if(si == arr.length -1)
		return true;
		
		if(arr[si] > arr[si+1])
			return false;
		
		
		boolean ans = isArraySortedusingSI(arr, si+1);
		return ans;
			
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		return arr;
	}
	public static void main(String[] args) {
		
		int[] arr = takeInput();
		System.out.println(isArraySorted(arr));
		System.out.println(isArraySortedusingSI(arr, 0));
	}

}
