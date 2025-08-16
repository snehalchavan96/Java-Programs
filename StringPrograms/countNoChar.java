package StringPro;

public class countNoChar {

	public static void main(String[] args) {
	
		String str="snehal here how r u";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				count++;
				
			}
		}
		System.out.println(count);
	}

}
