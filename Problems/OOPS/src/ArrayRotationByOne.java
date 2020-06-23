
public class ArrayRotationByOne {
	
	// Time Complexity - O(n * d) appoximately O(n^2)
	//Space Complecity - O(1)

	public static void  rotate(int[] arr, int d)
	{
		int n = arr.length;
		
		for(int i = 0 ; i < d ; i++)
		{
			leftRotateByOne(arr,n);
		}
		
		
	}
	public static void leftRotateByOne(int[] arr, int n) {
		
		int temp = arr[0];
		int i;
		for(i = 0 ; i < n-1 ; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		
		
	}
	
	static void printArray(int arr[]) 
	{ 
	    for (int i = 0; i < arr.length; i++) 
	        System.out.print(arr[i] + " "); 
	} 

	public static void main(String[] args) {
		
		int arr[] = {10,9,8,7,6,5,4};
		printArray(arr);
		System.out.println();
		rotate(arr, 2);
		printArray(arr);
	}

}
