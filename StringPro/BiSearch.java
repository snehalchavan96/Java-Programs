package StringPro;

import java.util.Arrays;

public class BiSearch {

	public static void main(String[] args) {
		
		int arr[]= {2,4,7,8,1,47,36,89};
		Arrays.sort(arr);
		
		int ele=36;
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[mid])
			{
				System.out.println("element found at  :"+mid);
				break;
			}
			else if(ele>arr[mid])
			{
				low=low;
				high=high+mid;
			}
			else
			{
				low=
			}
			
		}
		
	}

}
