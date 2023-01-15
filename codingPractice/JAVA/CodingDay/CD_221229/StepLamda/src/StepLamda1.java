// 일반적인 인터페이스와 이를 구현한 클래스 
// StepLamda2.java에서 이를 익명 클래스로 구현.

interface Printable
{
	public void print(String s);
}

class Printer implements Printable
{
	public void print(String s)
	{
		System.out.println(s);
	}
}

public class StepLamda1 {

	public static void main(String[] args) 
	{
		Printable prn = new Printer();
		prn.print("hello");
	}

}
