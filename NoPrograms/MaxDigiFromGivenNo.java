package NoPrograms;

import java.util.Scanner;

public class MaxDigiFromGivenNo {

	public static void main(String[] args) {
		
		System.out.println("Enter a No");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int max=no%10;  // 9743 ---3
		// max=3; 4
		
		while(no>0)  //9743>0 | 974>0 | 97>0
		{
			if(no%10 > max)   //9743= >3 | 974%10=4>3 | 97%10, 7>4
			{
				max=no%10; //974%10= 4  |
			}
			no=no/10; // 974 | 97
		}
		System.out.println(max);
		
	}

}
