package NoPrograms;

public class primeNumbPro {

	public static void main(String[] args) {
		
		int no=7;
		int temp=0;
		
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp++;	
			}
		}
		if(temp==0)
		{
			System.out.println("No is prime !");
		}
		else
		{
			System.out.println("No is not prime ");
		}
	}
}
