package NoPrograms;

import java.util.Scanner;

public class FactTillNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no till you want factors ");
		
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				System.out.println(i);
			
			}
		}
		
	}

}
