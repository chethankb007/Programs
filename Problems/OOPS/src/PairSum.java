import java.util.Arrays;

public class PairSum {
	
	public static int count(int[] arr,int elem1,int elem2)
	{
		int count1 = 0;
		int count2 = 0;
		for(int i = 0 ;i<arr.length-1;i++)
		{
			if(elem1 == arr[i] )
				count1++;
		}
		for(int j = 0 ;j<arr.length-1;j++)
		{
			if(elem2 == arr[j] )
				count2++;
		}
		int count = count1*count2;
		return count;
	}
	public static void pairSumUniquePairs(int[] arr, int num)
	{
		if(arr.length == 0)
			return;
		int size = arr.length;
		Arrays.sort(arr);
		int i = 0 , j = size - 1;
		int sum = 0;
		
		
		
		while(i < j)
		{
			sum = arr[i] + arr[j];
			if( sum == num ) 
			{
				System.out.println(arr[i] +  " " + arr[j]);
				i++;
				j--;
			}
			
			else if(sum > num)
				j--;
			else
				i++;
			
		}
		
	}
	
	public static void pairSumDuplicatePairs(int[] arr, int num)
	{
		if(arr.length == 0)
			return;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length -1; i++)
		{
			   for(int j = i + 1; j < arr.length; j++)
			   {
			      if(arr[i] + arr[j] == num){
					System.out.println(arr[i] +  " " + arr[j]);
			      }
			   }
		}
		
	}
	

	public static void main(String[] args) {
		int arr[] = {1,3,6,2,5,4,3,2,4};
		System.out.println("W/O duplicates - Pair sum");
		pairSumUniquePairs(arr, 7);
		System.out.println("*************************");
		System.out.println("With Duplicates - Pair Sum");
		pairSumDuplicatePairs(arr, 7);
	}

}
