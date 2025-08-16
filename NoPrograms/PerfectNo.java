package NoPrograms;

public class PerfectNo {

	public static void main(String[] args) {
		
		int no=6;
		int n=no;
		int sum=0;
		
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("It's a perfect No !!");
		}
		else
		{
			System.out.println("It's Not a perfect No ");
		}
	}
}












