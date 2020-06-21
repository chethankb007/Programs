package com.algo.sorting.GeeksForGeeks;

public class InsertionSort {

	public static void insertionSort(int arr[]) 
	{
		int n = arr.length;
		for(int i = 1 ; i < n ; i++) 
		{
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key) 
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {

		int a[] = {15,3,10,2,6,1,9};
		printArray(a);
		insertionSort(a);
		printArray(a);
		

	}
	private static void printArray(int[] arr) {
		for(int c : arr)
			System.out.print(c+" ");
		System.out.println();
	}

}
