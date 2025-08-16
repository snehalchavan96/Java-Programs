package NoPrograms;

import java.util.Scanner;

public class MaxDigiNo {

	public static void main(String[] args) {
	
		System.out.println("enter a no ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int max=no%10;
		//int n=no%10;
		while(no>0)
		{
			if(no%10>max)
			{
				max=no%10;	
			}
			no=no/10;
		}
		System.out.println(max); 
	}
}
