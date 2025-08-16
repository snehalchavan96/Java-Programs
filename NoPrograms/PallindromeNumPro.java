package NoPrograms;

import java.util.Scanner;

public class PallindromeNumPro {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no ");
		
		int no=sc.nextInt();
		int orgno=no;
		int rem=0;
		int rev=0;
		
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(orgno==rev)
		{
			System.out.println("No is Pallindrome !!");
		}
		else
		{
			System.out.println("No is not Pallindrome !");
		}
	}
}
