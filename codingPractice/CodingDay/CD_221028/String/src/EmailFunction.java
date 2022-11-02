
public class EmailFunction {
	private String email;		// email
	private int atIndex;		// @가 있는 인덱스 
	
	/////////////////////////////////////////////////
	// 생성자 
	
	// 기본생성자 
	public EmailFunction()
	{
		email = null;
		atIndex = 0;
	}
	
	// 오버로딩된 생성자 
	public EmailFunction(String email)
	{
		this.email = email;
		this.atIndex = email.indexOf("@");
	}
	
	////////////////////////////////////////////////
	// Getter, Setter
	
	public String getEmail()
	{
		return email;
	}
	
	///////////////////////////////////////////////
	// Method
	
	// 초기화 
	public void init(String email)
	{
		this.email = email;
		this.atIndex = email.indexOf("@");
	}
	
	// 문자열이 이메일 형식이 맞는지 맞지 않는지 판단 
	public boolean isEmail()
	{
		// 기준1) @는 1개 있어야 한다.
		int atCnt = 0;
		
		for(int i = 0; i < this.email.length(); i++)
		{
			if(this.email.charAt(i) == '@')
				atCnt++;
		}
		
		if(atCnt != 1)
			return false;
		
		// 기준2) @ 앞쪽에 문자열이 존재해야한다.
		// 기준3) @ 뒷쪽에 문자열이 존재해야한다.
		int emailLastIndex = this.email.length() - 1;
		
		if((this.atIndex == 0) || (this.atIndex == emailLastIndex))
			return false;
		
		// 기준4) @ 뒤에 최소한 한개의 .이 존재해야 한다.
		for(int i = this.atIndex+1; i < this.email.length(); i++)
		{
			if(this.email.charAt(i) == '.')
				return true;
		}
		
		return false;
	}
	
	// 아이디를 추출
	public String extractID()
	{
		if(isEmail() == false)
			return "";
		
		String ID = this.email.substring(0, this.atIndex);
		
		return ID;
	}
	
	// 도메인 추출 
	public String extractDomain()
	{
		if(isEmail() == false)
			return "";
		
		String Domain = "www." + this.email.substring(this.atIndex + 1);
		
		return Domain;
	}
	
	// toString() 재정의 
	@Override
	public String toString()
	{
		return "email: " + this.email + "\nID: " + extractID() + "\nDomain: " + extractDomain() + "\n";
	}

}
