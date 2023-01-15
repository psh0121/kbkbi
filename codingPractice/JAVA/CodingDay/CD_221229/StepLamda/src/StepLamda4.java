interface Printable4
{
	public void print(String s);
}
public class StepLamda4 {

	public static void main(String[] args) 
	{
		Printable4 prn = null;
		
		prn = (String s) -> {System.out.println(s);};	// 가장 긴 타입의 람다식
		prn.print("Hello1");
		
		prn = (String s) -> System.out.println(s);	// 중괄호를 생략 (한줄인 경우)
		prn.print("Hello2");
		
		prn = (s) -> {System.out.println(s);};	// 파라미터의 타입을 생략 (많이 사용함)
		prn.print("Hello3");
		
		prn = s -> {System.out.println(s);};	// 파라미터의 소괄호를 생략 (파라미터가 1개인 경우에만)
		prn.print("Hello4");

	}

}
