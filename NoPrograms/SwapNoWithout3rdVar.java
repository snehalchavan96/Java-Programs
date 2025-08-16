package NoPrograms;

import java.util.Scanner;

public class SwapNoWithout3rdVar {

	public static void main(String[] args) {
		
		System.out.println("Enter no 1 ");
		Scanner sc=new Scanner(System.in);
		
		int no1=sc.nextInt();
		System.out.println("Enter no2 ");
		int no2=sc.nextInt();
		
		System.out.println(no1+" "+no2);
		no1=no1+no2;			// a=a+b
		no2=no1-no2;			// b=a-b
		no1=no1-no2;			// a=a-b
		
		System.out.println(no1+ " "+ no2);
	}

}
