package InterviewProg;

public class BiggestNo {

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,7,8,20,10,40,100};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
