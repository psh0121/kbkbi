
public class Friend {
	
	protected String name;		// 이름
	protected String phoneNumber;	// 전화번호
		
	// 기본생성자
	public Friend()
	{
		name = null;
		phoneNumber = null;
	}
	
	// 오버로딩된 생성자
	public Friend(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	///////////////////////////////////////////////
	
	public String getName()
	{
		return name;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		return "이름 : " + name + "\n전화번호 : " + phoneNumber;
	}	
}
