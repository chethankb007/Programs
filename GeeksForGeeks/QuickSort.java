package com.algo.sorting.GeeksForGeeks;

public class QuickSort {

	public static void quickSort(int[] arr , int low , int high) {
		if(low < high) 
		{
			int pi = partition(arr,low,high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
		
	}
	private static int partition(int[] arr, int low, int high) {
		
		int pivot_element = arr[high];
		int i = (low-1);//index of smalller elemet
		for( int j=low;j<high;j++) 
		{
			if(arr[j] <= pivot_element) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		//swap the pivot elemnt to its position
		int temp =  arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
		
	}
	public static void main(String[] args) {

		int arr[] = {5,4,3,2,10,6,3,7};
		
		printArray(arr);
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
		

	}
	
	private static void printArray(int[] arr) {
		for(int c : arr)
			System.out.print(c+" ");
		System.out.println();
	}

}
