package com.ds.recursion;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[], int si,int ei, int x)
	{
		if(si > ei)
			return -1;
		
		int midIndex = (si+ei)/2;
		
		if(arr[midIndex]==x)
			return midIndex;
		else if(arr[midIndex] > x)
			return binarySearch(arr, si, midIndex, x);
		else
			return binarySearch(arr, midIndex+1, ei, x);
		
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
		System.out.println(binarySearch(arr, 0, arr.length-1, num));
	}
	

}
