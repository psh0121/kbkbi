
public class Member implements Cloneable{
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	public Member()
	{
		id = null;
		name = null;
		password = null;
		age = 0;
		adult = false;
	}
	
	public Member (String id, String name, String password, int age, boolean adult)
	{
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public Member getMember()
	{
		Member cloned = null;
		
		try
		{
			cloned = (Member) clone();
		}
		
		catch(CloneNotSupportedException e) {}
		
		return cloned;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public boolean getAdult() {
		return adult;
	}
	
	
}
