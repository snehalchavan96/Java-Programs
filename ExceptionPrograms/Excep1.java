package ExceptionPrograms;

public class Excep1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try 
		{
			int res=a/b;
			System.out.println(res);
		}
		catch(Exception ex)
		{
			System.out.println(ex);	
		}	
	}
}
