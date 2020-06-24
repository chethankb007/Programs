package com.ds.recursion;

import java.util.Scanner;
/*
 * Last index means - 
 * if x is present multiple times in the array, return the index at which x comes last in the array.
 */

public class LastindexofNum {
	
	public static int lastIndexSI(int[] arr, int x , int si)
	{
		if(si == arr.length)
			return -1;
		
		
		int index = lastIndexSI(arr, x, si+1);
		if(index !=-1)
			return index;
		
		if(arr[si] == x)
			return si;
		
		return -1;
		
	
	}

 public static int lastIndexLi2( int input[], int x,int si)
 {
	        
	    	 if(si<0){
	             return -1;
	         }
	         if(input[si]==x){
	             return si;
	         }
	         int last=lastIndexLi2(input, x,si-1);
	             return last;
	   
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
		System.out.println(lastIndexSI(arr, num, 0));
	}

}
