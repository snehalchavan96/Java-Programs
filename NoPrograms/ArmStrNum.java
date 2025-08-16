package NoPrograms;

public class ArmStrNum {

	public static void main(String[] args) {
		
		int no=378;
		int n=no;
		int r;
		int sum=0;
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(no==sum)
		{
			System.out.println("no is armstrong");
			
		}
		else
		{
			System.out.println("No is not armstrong");
		}
	}

}
