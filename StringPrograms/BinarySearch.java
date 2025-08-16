package StringPro;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int ele=78;
		int arr[]= {45,56,78,93,24};
		
		Arrays.sort(arr);
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(ele==arr[mid])
			{
				System.out.println("element found at index "+ mid);
				break;
			}
			else if(ele<arr[mid])
			{
				low=low;
				high=mid-1;
			}
			else if(ele>arr[mid])
			{
				low=mid+1;
				high=high;
			}	
		}
		//System.out.println("element found at : "+mid);	
	}
}
