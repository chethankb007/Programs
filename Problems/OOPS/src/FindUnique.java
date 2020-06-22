import java.util.Scanner;

/*
 * Given an integer array of size 2N + 1. In this given array, 
 * N numbers are present twice and one number is present only once in the array.
 * You need to find and return that number which is unique in the array.
 
 
 This approach uses 2 properties of XOR:
1. XOR of a number with itself is 0.
2. XOR of a number with 0 is number itself.

 */
public class FindUnique {

	public static int findUnique(int[] arr) {
		
		int res = 0;
		for(int i = 0 ; i<arr.length ; i++)
			res = res ^ arr[i];
		
		
		return res;
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
		System.out.print(FindUnique.findUnique(arr));
	}

	
}
