package StringPro;

public class ReplaceWords {
// replace given words 
	public static void main(String[] args) {
		
		String str="The message for today, How are you?";
		String str2[]=str.split(" ");
		String str3="";
		
		for(int i=0;i<str2.length;i++)
		{
			String rep=str2[i];
			if(rep.equals("message"))
			{
				str3+="msg";
			}
			else if(rep.equals("today"))
			{
				str3+="today";
			}
			else if(rep.equals("are"))
			{
				str3+="r";
			}
			else
			{
				str3+=rep;
			}
			str3+=" ";	
		}
		System.out.println(str3);
	}
}
