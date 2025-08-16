package PatternProgra;

import java.util.Scanner;

public class HollowSqr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no1 ");
		int n1=sc.nextInt();
		
		System.out.println("Enter a no2 ");
		int n2=sc.nextInt();
		
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				if(i>=2&&j>=2&&i<=4&&j<=4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}
}
