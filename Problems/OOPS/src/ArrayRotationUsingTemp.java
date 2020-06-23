
public class ArrayRotationUsingTemp {
	
	//Time Complexity O(n)
	//Space Complexity O(d)--since we need to store d elements in temp or auxiliary array
	
	public static void  rotate(int[] arr, int d)
	{
		if(arr.length == 0 || d == 0)
			return;
		
		if( d > arr.length && arr.length != 0 )
			d = d % arr.length;
		
		
		int n = arr.length;
		int[] temp = new int[d];
		
		
		for(int i = 0 ; i < d ; i++) // Copy first d elementsto temp array
		{
			temp[i] = arr[i];
		}
		
		int count = 0;
		while(count < d ) //shift all elements to left by d position
		{
			for( int j = 0 ; j<n-1; j++)
			{
				arr[j] = arr[j+1];
			}
			count++;
			
		}
		for( int k = 0 ; k < temp.length; k++) //store temp array elements into original array 
		{
			arr[n-d+k] = temp[k];
		}	
		
	}

	static void printArray(int arr[]) 
	{ 
	    for (int i = 0; i < arr.length; i++) 
	        System.out.print(arr[i] + " "); 
	} 
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		printArray(arr);
		rotate(arr, 10);
		System.out.println();
		printArray(arr);

	}

}
