
public class UniFriend {
	
	// 대학 동창 (이름, 전공, 전화번호) 
	private String name;
	private String major;
	private String phone;
	
	public UniFriend()
	{
		this.name = null;
		this.major = null;
		this.phone = null;
	}
	
	public UniFriend(String name, String major, String phone)
	{
		this.name = name;
		this.major = major;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
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
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("전화번호 : " + phone);
	}
	
}
