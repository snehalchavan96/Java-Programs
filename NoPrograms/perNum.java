package NoPrograms;

import java.util.Scanner;

public class perNum {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no ");
		
		int no=sc.nextInt();
		int sum=0;
		int n=no;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum) 
		{
			System.out.println("No is Perfect...!");
		}
		else
		{
			System.out.println("No is not perfect...");
		}
	}

}
