package StringPro;

public class TotalNoChar {

	public static void main(String[] args) {
		
		String str="heyIamHereToHelpYou";
		int no=0;
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				char ch=str.charAt(i);
				char ch1=str.charAt(j);
				if(ch!=' ' && ch1==' ') {
				no=no+1;
			}	
			}
		}
		System.out.println(no);
	}
}
