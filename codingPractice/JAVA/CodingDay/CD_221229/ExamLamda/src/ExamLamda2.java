@FunctionalInterface	// 더이상 메소드를 넣지 마세요.
interface Addable
{
	public void printSum(int a, int b);
}

public class ExamLamda2 {

	public static void main(String[] args) 
	{
		Addable prnSum = null;
		
		prnSum = (int a, int b) -> {System.out.println(a + b);};	// 가장 긴 타입의 람다식
		prnSum.printSum(1, 2);
		
		prnSum = (int a, int b) -> System.out.println(a + b); 	// 중괄호를 생략 (한줄인 경우)
		prnSum.printSum(3, 4);
		
		prnSum = (a, b) -> {System.out.println(a + b);};	// 파라미터의 타입을 생략 (많이 사용함)
		prnSum.printSum(5, 6);

	}

}
