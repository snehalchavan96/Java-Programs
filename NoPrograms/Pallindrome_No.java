package NoPrograms;

public class Pallindrome_No {

	public static void main(String[] args) {
		
		int no=191;
		int no2=no;
		
		int rev=0;
		int rem=0;
		
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(no2==rev)
		{
			System.out.println("no is pallindrome...!!!");	
		}
		else
		{
			System.out.println("no is not pallindrome...!!!");
		}
	}
}
