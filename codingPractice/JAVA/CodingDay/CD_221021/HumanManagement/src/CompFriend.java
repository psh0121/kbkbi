
public class CompFriend {
	
	// 회사 동료 (이름, 부서, 전화번호) 
	private String name;
	private String dept;
	private String phone;
	
	public CompFriend()
	{
		this.name = null;
		this.dept = null;
		this.phone = null;
	}
	
	public CompFriend(String name, String dept, String phone)
	{
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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
		System.out.println("부서 : " + dept);
		System.out.println("전화번호 : " + phone);
	}
	
}
