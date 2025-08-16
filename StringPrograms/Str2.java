package StringPro;

public class Str2 {
	// to convert the first letter into uperCase
	
	public static void main(String[] args) {
		String str="hey hi hello";
		String [] str2=str.split(" ");
		
		String str3="";
		for(int i=0;i<str2.length;i++)
		{
			char ch=str2[i].charAt(0);
			
			String cl=String.valueOf(ch).toUpperCase();
			String sub=str2[i].substring(1);
			str3=cl+sub+" ";
			
		}
		System.out.print(str3.trim());
	}
}