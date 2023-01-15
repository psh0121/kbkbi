
interface Printable3
{
	public void print(String s);
}

public class StepLamda3 
{
	public static void printHello(Printable3 prn)
	{
		prn.print("Hello");
	}

	public static void main(String[] args) 
	{
		// 익명 클래스 코드
		// 익명 클래스를 구현하는 전제는 1. 클래스 1개, 2. 함수형 인터페이스
		// -> 가 나왔다는건 함수 1개짜리 객체라는 의미이다.
		// 파라미터 -> 구현
		Printable3 prn = (s) -> { System.out.println(s); };
							
		prn.print("hello3");
		
		printHello(prn);
		
		printHello((s) -> { System.out.println(s); });
	}

}
