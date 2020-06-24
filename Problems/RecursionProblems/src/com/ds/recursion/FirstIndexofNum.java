package com.ds.recursion;

import java.util.Scanner;

/*
 * Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
	First index means, the index of first occurrence of x in the input array.
 */

public class FirstIndexofNum {
	
public static int firstIndex(int[] arr , int x)
{
	if(arr.length <= 0)
		return -1;
	
	if(arr[0] == x)
		return 0;
	
	int newArr[] = new int[arr.length -1];
	for(int i = 1 ; i<arr.length ; i++)
		newArr[i-1] = arr[i];
	
	int index = firstIndex(newArr, x);
	
	if(index !=-1)
	index = index+1;
	
	return index;
}
public static int firstIndexSI(int[] arr, int x , int si)
{
	if(si == arr.length)
		return -1;
	
	if(arr[si] == x)
		return si;
	int index = firstIndexSI(arr, x, si+1);
	return index;
	
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
	System.out.println(firstIndexSI(arr, num, 0));
}
}