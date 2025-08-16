package StringPro;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="he l lo ho w ar e yo u?";
		String st2="";
		
		st2=str.replaceAll("\\s","");
		System.out.println(st2);
		
	}

}
