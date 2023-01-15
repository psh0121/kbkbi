/*
 * interface, lamda-expression을 이용하여
 * 구구단을 출력하는 코드를 작성해보세요. 
 */

// 함수형 인터페이스
interface guguCalculable
{
	public void printGugudan(int dan);
}

public class ExamLamda1 {

	public static void main(String[] args) 
	{
		// 1. 람다식으로 객체를 만든다. 
		guguCalculable gugudan = (dan) -> {
			
			int num = 1;	// 곱수
			
			for(int i = 0; i < 9; i++)
			{
				System.out.println(dan + " x " + num + " = " + (dan*num));
				num++;
			}
		};
		
		// 2.구구단 호출한다.
		gugudan.printGugudan(3);
	}

}
