package StringPro;

public class DuplicatesInAString {

	public static void main(String[] args) {
		
		String str="snehalChavan";
		int len=str.length();
		char arr[]=str.toCharArray();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicates in String : "+ arr[j]);
					break;
					
				}
				
			}
			
		}
	}

}
