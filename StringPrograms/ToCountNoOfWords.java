package StringPro;

public class ToCountNoOfWords {

	public static void main(String[] args) {
		String str="hello how are you are you happy?";
		int count=1;
		for(int i=0;i<str.length()-1;i++) 
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
			System.out.println("No of words in the given string is : "+count);
	}
}
