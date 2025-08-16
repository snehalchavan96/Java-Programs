package InterviewProg;

public class Str1 {

	public static void main(String[] args) {
		
		String str="kjkftytfdghh";
		String str1="";
		
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
					if(str.charAt(i)==str.charAt(j))
					{
						str1=str1+str.charAt(i);
					}
			}	
		}
		System.out.println(str1);
		
	}
}
