package InterviewProg;

public class p1{

	public static void main(String[] args) {
		
		OverRideEquals obj=new OverRideEquals("snehal",764);
		OverRideEquals obj2=new OverRideEquals("snehal",7964);
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj.equals(obj2));
		
	}
}
