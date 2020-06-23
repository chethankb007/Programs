import java.util.Arrays;
import java.util.Scanner;
/*
 * Given a random integer array and a number x. 
 * Find and print the triplets of elements in the array which sum to x.
 *	While printing a triplet, print the smallest element first.
 */
public class TripletSum 
{
	public static void FindTriplet(int[] arr, int num)
	{
		
       		 if(arr.length == 0)
		 return;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length -1; i++)
		{
			   for(int j = i + 1; j < arr.length; j++)
			   {
                  		for(int k = j +1 ;k<arr.length;k++)
                  		{
                      				 if(arr[i] + arr[j] + arr[k] == num)
						 {
							System.out.println(arr[i] +  " " + arr[j] + " " + arr[k]);
			      			 }
                  		}
			     
			   }
		}
	}//end of FindTriplet
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput() {
		System.out.println("Enter size of the array");
		int size = s.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
	
		int[] arr = takeInput();
		System.out.println("Enter the number");
		int num = s.nextInt();
		TripletSum.FindTriplet(arr, num);
	}

}
