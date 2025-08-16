package StringPro;

public class ToCountCharactersInString {

	public static void main(String[] args) {
		
		String str="Goiio tou Hell";
		str=str+" ";
		
		int start=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				String word=str.substring(start,i);
				System.out.println(word + " = "+ word.length());
				start=i+1;
				if(word.length()%2==0)
				{
					System.out.println(word);
					
				}
				
			}
			
			
		}
		
	}

}
