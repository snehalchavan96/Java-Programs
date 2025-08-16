package ArrayPrograms;

public class NegativeAtEnd {

	public static void main(String[] args) {
	
		int arr[]= {3,4,6,-2,7,-5,-10,8,-40};
		int pos=0;
		int neg=arr.length-1;
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				arr[pos]=arr[i];
				pos++;
				
			}
			else
			{
				arr[neg]=arr[i];
				neg--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+ arr[i]);
			
		}
	}

}
