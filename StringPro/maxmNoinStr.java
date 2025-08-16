package StringPro;

public class maxmNoinStr {

	public static void main(String[] args) {
	
		String str="ft68ffjui68685897";
		String st="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				st=st+str.charAt(i);
			}
			
		}

		System.out.println(st);
		
		int no=Integer.parseInt(st);
		System.out.println(no);
		int n=no;
		int max=n%10;
		while(n>0)
		{
			if(n%10>max)
			{
				max=n%10;
			}
			n=n/10;
		}
		System.out.println(max);	
	}
}
