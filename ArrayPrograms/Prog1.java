package ArrayPrograms;

public class Prog1 {

	//Duplicate in array
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,6,3,1,8,9,6,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
					
				}
				
			}
			
		}
		
	}
}
