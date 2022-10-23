
public class CompFriend extends Friend {
	
	// 회사 동료 (이름, 부서, 전화번호) 
	private String dept;
	
	public CompFriend()
	{
		super();
		this.dept = null;
	}
	
	public CompFriend(String name, String dept, String phone)
	{
		super(name, phone);
		this.dept = dept;
	}
	
	//////////////////////////////////////////////////////////////
	// Getter, Setter

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//////////////////////////////////////////////////////////////
	// 기능 
	
	public void showInfo()
	{
		System.out.println("이름 : " + super.getName());
		System.out.println("부서 : " + dept);
		System.out.println("전화번호 : " + super.getPhone());
	}
	
}
