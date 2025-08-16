package ExceptionPrograms;

public class nullPointerExcep {

	public static void main(String[] args) {
		
		String str=null;
		
		try
		{
		System.out.println(str.length());
		}
		catch(NullPointerException excep)
		{
			System.out.println(excep);
			
		}
	}

}
