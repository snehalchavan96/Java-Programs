
public class InfiniteNoPro {

	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int c=3;
		int d;
		
		System.out.print(a+" "+b+" "+ c);
		
		
		for(int i=1;i>=0;i++)
		{
			d=c*2;
			System.out.print(" "+d);
			
			b=c;
			c=d;
		}	
	}
}
