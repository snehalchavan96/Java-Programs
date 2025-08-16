package NoPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int no=372;
		int temp=no;
		int r;
		int sum=0;
		
		while(temp>0)
		{
			r=temp%10;
			//temp=temp/10;
			sum=sum+r*r*r;	
			temp=temp/10;
		}
		
		if(sum==no)
		{
			System.out.println("No is Armstrong !!!");
		}
		else
		{
			System.out.println("No is not Armstrong");
		}
	}
}


