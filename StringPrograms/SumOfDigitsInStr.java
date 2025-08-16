package StringPro;
import java.util.Scanner;
public class SumOfDigitsInStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string including numbers : ");
		
		String str=sc.nextLine();
		String str2="";
		int rem=0;
		int sum=0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
		int no=Integer.parseInt(str2);
		while(no>0){
			rem=no%10;
			sum=sum+rem;
			no=no/10;	
		}
		System.out.println("Sum of digits : "+ sum);
	}
}
