package com.algo.sorting;

public class QuickSort1 {
	
	public static void sort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int pi = partition(arr, low , high);
			sort(arr, low , pi-1);
			sort(arr, pi+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot =  arr[high];
		int i = low - 1;
		
		for(int j = low; j < high ; j++)
		{
			if(arr[j] <= pivot) 
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

	private static void printArray(int[] arr) {
		for(int c : arr)
			System.out.print(c+" ");
		System.out.println();
	}
	public static void main(String[] args) {

		int[] arr= {10,9,8,7,6,5,4,3,2,1,5};
		System.out.println("Array Before Quick Sorting");
		printArray(arr);
		System.out.println("*************");
		sort(arr, 0, arr.length-1);
		System.out.println("Array After Sorting");
		printArray(arr);
	}

}
