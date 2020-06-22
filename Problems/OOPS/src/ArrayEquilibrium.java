import java.util.Scanner;

/*
 Find and return the equilibrium index of an array. 
 Equilibrium index of an array is an index i such that -
 			the sum of elements at indices less than i is equal to the sum of elements at indices greater than i.
 
 Element at index i is not included in either part.
If more than one equilibrium index is present, you need to return the first one.
 And return -1 if no equilibrium index is present
 */


public class ArrayEquilibrium {
	
	private static int arrayEquilibrium(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		
		int rightsum = 0 , leftsum = 0;
		
		/* Find sum of the whole array  in rightsum*/
		for(int i = 0; i<n;i++)
			rightsum = rightsum + arr[i];
		
		for(int i = 0; i < n ; i++)
		{
			rightsum = rightsum - arr[i];
			
			if(rightsum == leftsum)
				return i;
			else
				leftsum = leftsum + arr[i];
		}
		return  -1;
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
		System.out.print(ArrayEquilibrium.arrayEquilibrium(arr));
	}

	
}
