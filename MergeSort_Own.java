package com.algo.sorting;

public class MergeSort_Own {

	
	public static void mergeSort(int arr[], int start,int end) 
	{
		if(start < end) 
		{
			int mid = (start + end) / 2;
			mergeSort(arr,start,mid);
			mergeSort(arr, mid+1, end);
			merge(arr,start,mid,end);
		}
	}
	private static void merge(int[] arr, int start, int mid, int end) {
		
		int i =  start;
		int j = mid + 1;
		int  k = 0;
		int[] temp = new int[end -  start + 1];
		
		while(i <= mid && j <= end)
		{
			if(arr[i] <= arr[j])
			{
				temp[k++] = arr[i++];
			}
			else
			{
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= mid)
			temp[k++] = arr[i++];

		while(j <= end)
			temp[k++] = arr[j++];
		
		for(i =start;i<=end;i++)
			arr[i] = temp[i-start];

	}
	public static void main(String[] args) {
		int[] arr= {10,9,8,7,6,5,4,3,2,1,5};
		System.out.println("Array Before Sorting");
		printArray(arr);
		System.out.println("*************");
		mergeSort(arr, 0, arr.length-1);
		System.out.println("Array After Sorting");
		printArray(arr);

	}
	private static void printArray(int[] arr) {
		for(int c : arr)
			System.out.print(c+" ");
		System.out.println();
	}

}
