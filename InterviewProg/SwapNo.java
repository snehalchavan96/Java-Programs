package InterviewProg;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no1 ");
		int n1=sc.nextInt();
		
		System.out.println("enter no 2 ");
		int n2=sc.nextInt();
		System.out.println("Before swapping : "+n1+" "+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping : "+n1+" "+n2);
		
	}
}
