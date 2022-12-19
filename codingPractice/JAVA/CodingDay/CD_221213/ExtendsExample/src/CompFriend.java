public class CompFriend extends Friend 
{
	private String dept;		// 전공
	
	public CompFriend()
	{
		super();
		dept = null;
	}
	
	public CompFriend(String name, String dept, String phoneNumber)
	{
		super(name, phoneNumber);
		this.dept = dept;
	}
	
	//////////////////////////////////////////////
	
	public String getDept()
	{
		return dept;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	
	public String toString()
	{
		return super.toString() + "\n부서 : " + dept;
	}
}