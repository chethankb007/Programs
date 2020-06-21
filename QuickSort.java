package com.algo.sorting;

public class QuickSort {
	
	public static void quickSort(int[] arr,int si,int ei) {
		
		if(si >= ei)
			return;
		
		int pi = partition(arr,si,ei);
		quickSort(arr, si, pi-1);
		quickSort(arr, pi+1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {
		
		int pivotElement = arr[si];
		
		int smallerNumCount = 0;
		
		for(int i = si+1; i <= ei ; i++)
			if(arr[i] < pivotElement)
			{
				smallerNumCount++;
			}
		
		int temp = arr[si + smallerNumCount];
		arr[si + smallerNumCount] = pivotElement;
		arr[si] = temp;
		
		int i = si;
		int j = ei;
		while(i < j) {
			
			if(arr[i] < pivotElement)
				i++;
			else if(arr[j] >= pivotElement)
				j--;
			else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
				
		}
		return si + smallerNumCount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
