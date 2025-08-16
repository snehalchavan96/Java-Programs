package ArrayPrograms;

import java.util.Arrays;

public class MissingElementInArr {

	public static void main(String[] args) {
		int arr []= {4,5,3,2,1,7};
		//int sortArr=[arr.length];
		int sum1=0;
		int sum2=0;
		
		System.out.println("array before sorting  :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " +arr[i]);
		}
		System.out.println();
		System.out.println("array after sorting  :");
		Arrays.sort(arr);    // inbuilt method to sort the array

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " +arr[i]);
			sum1=sum1+arr[i]; 
		}
		System.out.println();
		System.out.println(sum1);
		
		for(int i=0;i<=7;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println(sum2);
		System.out.println("missing element in array  : "+ (sum2-sum1));
	}
}
