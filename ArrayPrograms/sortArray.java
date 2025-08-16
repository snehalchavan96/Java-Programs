package ArrayPrograms;

public class sortArray {

	public static void main(String[] args) {
	
		int arr[]= {3,76,0,34,100,20,2,80,1};
		int temp=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}	
			}	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+ arr[i]);
		}	
	}
}
