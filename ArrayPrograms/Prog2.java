package ArrayPrograms;

public class Prog2 {
// maximum no in array
	
	public static void main(String[] args) {
		
		int a[]= {23,45,56,78,89,78,99};
		int max=a[0];
		int max2=a[1];
		int min=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

	