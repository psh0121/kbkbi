
public class Friend {
	
	private String name;
	private String phone;
	
	public Friend()
	{
		this.name = null;
		this.phone = null;
	}
	
	public Friend(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}
	
	//////////////////////////////////////////////////////////////
	// Getter, Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//////////////////////////////////////////////////////////////	
	// 기능 

	public void showInfo()
	{
		System.out.println("정보를 보여줘!");
	}
	

}
