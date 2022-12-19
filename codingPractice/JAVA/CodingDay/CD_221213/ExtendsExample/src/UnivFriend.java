
public class UnivFriend extends Friend {
	private String major;		// 전공
	
	public UnivFriend()
	{
		super();
		major = null;
	}
	
	public UnivFriend(String name, String major, String phoneNumber)
	{
		super(name, phoneNumber);
		this.major = major;
	}
	
	//////////////////////////////////////////////
	
	public String getMajor()
	{
		return major;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public String toString()
	{
		return super.toString() + "\n전공 : " + major;
	}
}
