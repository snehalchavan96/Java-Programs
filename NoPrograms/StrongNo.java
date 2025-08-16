package NoPrograms;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no ");
		
		int no=sc.nextInt();
		int temp=no;
		int rem=0;
		int sum=0;
		
		while(no>0)
		{
			rem=no%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			   {
				  fact=fact*i;
			   }
			sum=sum+fact;
			no=no/10;
		}
		if(sum==temp)
		{
			System.out.println("No is Strong ! ");
		}
		else
		{
			System.out.println("No is not Strong ");
		}
	}
}

