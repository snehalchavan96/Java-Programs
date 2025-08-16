package NoPrograms;
import java.util.Scanner;
public class PrimeNo 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start no to check prime or not ");
		int no=sc.nextInt();
		System.out.println("Enter a end no to check prime or not");
		int no2=sc.nextInt();
		
		int count=1;
		for(int i=no;i<=no2;i++)
		{
			if(no%i==0)
			{
				count++;
					if(count==2)
						{
							System.out.println(no);
						}
			}
		}
	}
}
