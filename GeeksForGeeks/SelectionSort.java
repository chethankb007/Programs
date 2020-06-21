package com.algo.sorting.GeeksForGeeks;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		
		int n = arr.length;
		int min_idx;
		for(int i = 0 ; i < n-1 ; i++) 
		{
			min_idx = i;
			for(int j = i+1 ; j<n ;j++)
			{
				if(arr[j] < arr[min_idx])
					min_idx = j;
			}	
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,4,3,2,1,5,8,0};
		
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
		

	}
	
	private static void printArray(int[] arr) {
		for(int c : arr)
			System.out.print(c+" ");
		System.out.println();
	}

}
