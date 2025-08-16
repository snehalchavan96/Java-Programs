package InterviewProg;

public class MergArr {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		int ar[]=new int [arr.length+arr2.length];
		
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(i<arr.length)
			{
				ar[i]=arr[i];
			}
			else
			{
				ar[i]=arr2[j];
				j++;
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
			
		}
	}
}
