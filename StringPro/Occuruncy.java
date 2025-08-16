package StringPro;

public class Occuruncy {

	public static void main(String[] args) {
		String str="jfhyyygjkhm";
		String st=str.toLowerCase();
		
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<st.length()-1;i++) {
				if(ch==st.charAt(i)) {
					count++;
				}	
			}
			if(count!=0) {
				System.out.println(ch+" "+count);
		}
		}
	}
}
