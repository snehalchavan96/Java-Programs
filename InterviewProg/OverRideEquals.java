package InterviewProg;

public class OverRideEquals {

	String name="snehal";
	int id=764;
	
	OverRideEquals(String nam, int i)
	{
		this.name=nam;
		this.id=i;
	}
	
	public boolean equals(Object var)
	{
		boolean flag=false;
		
		if(this.name==((OverRideEquals)var).name)
		{
			flag=true;
		}
		return flag;
	}
}
