package ArrayPrograms;

public class Missing_Ele {

	public static void main(String[] args) {
	
		int arr[]= {5,4,6,3,1,7};
		int expe_sum=arr.length+1;
		int total_sum=expe_sum*(expe_sum+1)/2;    //7*8/2
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("missing no in array : "+(total_sum-sum));
		System.out.println(total_sum);
		System.out.println(sum);
		
	}

}
