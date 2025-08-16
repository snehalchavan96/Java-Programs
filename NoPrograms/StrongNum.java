package NoPrograms;

public class StrongNum {

	public static void main(String[] args) {
		
		int no=40585;
		int n=no;
		int sum=0;
		
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			n=n/10;
		}
		if(no==sum)
		{
			System.out.println("No is Strong !!");
		}
		else
		{
			System.out.println("No is not Strong ");
		}
	}
}
