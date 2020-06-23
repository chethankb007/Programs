
public class ArrayRotation {
	
	///Time Complexity -O(n)
	// Space Complexity O(1)
		
static void swapElements(int[] arr, int start , int end)
{
	int temp = arr[start];
	
	arr[start] = arr[end];
	arr[end] = temp;
	
	}
static void reverse(int arr[], int start, int end)
{
	while(start<end)
	{
		swapElements(arr, start, end);
		
		start = start + 1;
		end = end - 1;
	}
}

static void printArray(int arr[]) 
{ 
    for (int i = 0; i < arr.length; i++) 
        System.out.print(arr[i] + " "); 
} 

public static void rotate(int[] arr , int d)
{
	if(arr.length == 0 || d == 0)
		return;
	
	if(d > arr.length && arr.length != 0)
	{
		d = d % arr.length;
	}
	
	int n =arr.length;
	reverse(arr , 0 , d- 1);//reverse firt d elements
	reverse(arr , d , n	 -1);//reverse elements after d
	reverse(arr , 0 , n - 1);// reverse all elements
		
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        rotate(arr, 2); // Rotate array by 2 elements
        printArray(arr); 

	}
	

}
