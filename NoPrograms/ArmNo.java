package NoPrograms;

public class ArmNo {

	public static void main(String[] args) {
		
		int no=371;
		int orgn=no;
		
		int sum=0;
		int rem=0;
		
		while(no>0)
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
		if(orgn==sum)
		{
			System.out.println("no is armstrong no !!");
		}
		else
		{
			System.out.println("no is not armstrong !");
		}
	}
}
