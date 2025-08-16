package InterviewProg;

public class OverRideTostring {

	String name;
	int id;
	
	OverRideTostring(String nam, int i)
	{
		this.name=nam;
		this.id=i;
	}
	
	public String toString()
	{
		return "NASA IS HIRING "+ name;
	}
}
