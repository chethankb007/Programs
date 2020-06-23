import java.util.Scanner;

public class DuplicateInArray {

	/*
	 *  find and return that duplicate number present in the array.
		Assume, duplicate number is always present in the array.
		
		Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. 
		That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice.
	 */
	
	public static int duplicate(int[] arr) {
		
		int sum = 0, sum2 = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		int n = arr.length;
		
		sum2 = ((n - 2) * (n - 1))/2; // sum of n-2 natural nos.
		return sum-sum2;
		
	}
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(DuplicateInArray.duplicate(arr));
	

}

	
}
