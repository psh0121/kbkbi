
public class UniFriend extends Friend {
	
	// 대학 동창 (이름, 전공, 전화번호) 
	private String major;
	
	public UniFriend()
	{
		super();
		this.major = null;
	}
	
	public UniFriend(String name, String major, String phone)
	{
		super(name, phone);
		this.major = major;
	}
	
	//////////////////////////////////////////////////////////////
	// Getter, Setter

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	//////////////////////////////////////////////////////////////
	// 기능 
	
	public void showInfo()
	{
		System.out.println("이름 : " + super.getName());
		System.out.println("전공 : " + major);
		System.out.println("전화번호 : " + super.getPhone());
	}
	
}
