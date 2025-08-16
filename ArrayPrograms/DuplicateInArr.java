package ArrayPrograms;

public class DuplicateInArr {

	public static void main(String[] args) {
		
		int arr[]= {3,1,4,5,2};
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					System.out.print(" "+arr[i]);
				}
				
			}
			
		}
		
		if(flag=false)
		{
			System.out.println("there are no any duplicates present in array ");
		}
		
	}

}
