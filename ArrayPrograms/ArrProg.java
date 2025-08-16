package ArrayPrograms;

public class ArrProg {

	public static void main(String[] args) {
	
		int arr[]= {3,4,6,-2,7,-5,-10,8,-40};
		int pos=0;
		int neg=arr.length-1;
		
		int res[]=new int[arr.length];
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				res[pos]=arr[i];
				pos++;
				
			}
			else
			{
				res[neg]=arr[i];
				neg--;
			}
		}
		System.arraycopy(arr, 0, res, 0, arr.length);	
	
	}
	
}

 