package NoPrograms;

import java.util.Scanner;

public class factFOR {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no to get factorial of ");
		
		int no=sc.nextInt();
		int fact=1;
		
		for(int i=no;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
