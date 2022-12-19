interface PrinterOnly
{
	
}

public interface Printable {
	
	static String OS_VERSION = "10.5.4";
	
	public boolean init();
	public void print(String doc);
	
	// 인터페이스에 public이 생략되어 있다.
	// 인터페이스 안에는 변수를 선언할 수 없다.
	//	==> 인터페이스는 규약(약속)을 저장하기 위한것이기 때문에 변수선언은 맥락에 맞지 않는다.
	//	==> 단, static은 가능하다. 소속만 있고 전역영역에 들어가기 때문 
}
