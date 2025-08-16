class InvalidEmail extends Exception
{
	InvalidEmail(String Email)
	{
		super(Email);	
	}
}

public class CustomException {

	public static void email(String mail) throws InvalidEmail
	{
		String maill="snehalchavan1096@gmail.com";
		
		if(mail==maill)
		{
			System.out.println("Email matched...!");
		}
		else
		{
			throw new InvalidEmail("Email is not matching ");
		}
	}
	
	
	public static void main(String[] args) {
		
		try
		{
			email("snehalchavan1096@gmail.com");
		}
		catch(Exception var)
		{
			System.out.println(var);
		}

	}

}
