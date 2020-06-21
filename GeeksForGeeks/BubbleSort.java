package com.algo.sorting.GeeksForGeeks;

public class BubbleSort {

	public static void  bubbleSort(int arr[])
	{
		int n = arr.length;
		
		for(int i = 0; i < n - 1 ; i++) //at most n--1 passes for n elemnts
		{
			for(int j = 0 ; j < n - 1 - i ; j++)//-i since 1 comparison reduces for each pass
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	private static void printArray(int[] arr) {
		for(int c : arr)
			System.out.print(c+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		printArray(arr);

		bubbleSort(arr);
		printArray(arr);

	}

}
