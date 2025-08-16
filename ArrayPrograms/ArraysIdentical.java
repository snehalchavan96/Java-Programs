package ArrayPrograms;

import java.util.Arrays;

public class ArraysIdentical {

	public static void main(String[] args) {
		
		int arr []= {1,2,3,4,5,6,7};
		int arr2 []={1,2,3,4,5,6,7};
		
		boolean status= Arrays.equals(arr, arr2);
		if(status)
		{
			System.out.println("Arrays are identical ");
		}
		else
		{
			System.out.println("Arrays are not identical ");
		}
		
	}

}
