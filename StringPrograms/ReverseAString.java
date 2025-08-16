package StringPro;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str="helloIamSnehalChavan";
		String strrev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev=strrev+str.charAt(i);	
		}
		System.out.println(strrev);
	}
}