import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*	Given two random integer arrays, print their intersection. 
	That is, print all the elements that are present in both the given arrays
	
*/
public class ArrayIntersection {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		//System.out.println("Length and arr");
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}

	private static void intersection(int[] arr1, int[] arr2) {
		
		ArrayList<Integer> al=new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int n1 = arr1.length;
		int n2 = arr2.length;
				
		int i=0,j =0;
		while(i <n1 && j<n2)
		{
			if (arr1[i] < arr2[j]) 
		          i++; 
		        else if (arr2[j] < arr1[i]) 
		          j++; 
		        else 
		        { 
		          al.add(arr2[j]);
		          j++;
		          i++; 
		        } 
		}
		print(al);	
		}
			
	}
	


