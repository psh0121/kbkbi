
public enum TYPE 
{
	NORMAL(10),
	VIP(20);
	
	// 생성자에 private => 외부에서 설정해줄 수 없다.
	private TYPE(int t)
	{
		System.out.println("TYPE CONSTRUCTOR");
	}
}
