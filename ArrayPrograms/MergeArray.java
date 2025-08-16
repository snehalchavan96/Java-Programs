package ArrayPrograms;

public class MergeArray {

	public static void main(String[] args) {
		
		int arr[]= {5,3,5,1,3};
		int arr1[]= {3,2,5,7,9};
		int j=0;
		int a[]=new int[arr.length+arr1.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(i<arr.length)
			{
				a[i]=arr[i];
			}
			else
			{
				a[i]=arr1[j];
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}


