package NoPrograms;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no ");
		
		int no=sc.nextInt();
		int rev=0;
		int rem=0;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		
	}

}
