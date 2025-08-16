package ArrayPrograms;

public class ToSort0_1_2 {

	public static void main(String[] args) {
		
		
		//          0 1 2 3 4 5 6 7 8 9
		int arr[]= {2,1,0,2,0,2,1,0,2,1};
		int high=arr.length-1;
		int low=0;
		int mid=0;
		int temp;
		
		while(mid<=high)
		{
			switch(arr[mid])
			{
				case 0:
				{
					temp=arr[low];
					arr[low]=arr[mid];
					arr[mid]=temp;
					low++;
					mid++;
					break;	
				} 
				case 1:
				{
					mid++;
					break;
				}
				case 2:
				{
					temp=arr[mid];
					arr[mid]=arr[high];
					arr[high]=temp;
					high--;
					break;
				}
			
			}	
		}
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(" "+arr[i]);
			}
	}
}
