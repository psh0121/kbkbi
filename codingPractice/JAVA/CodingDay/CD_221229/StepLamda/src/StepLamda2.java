
interface Printable2
{
	public void print(String s);
}

public class StepLamda2 {

	public static void main(String[] args) 
	{
		// 기존 Printer클래스를 로컬-이너 클래스로 바꾸고 이를 다시 익명 클래스로 바꾸었다.
		Printable2 prn = new Printable2() {
							public void print(String s)
							{
								System.out.println(s);
							}};
							
		prn.print("hello2");
	}

}
