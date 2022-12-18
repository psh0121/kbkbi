
public class Example01 {
	
	public static int pow2(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		return 2 * pow2(n - 1);
	}

	public static void main(String[] args) {
		// 파라미터로 정수 n을 입력받아서 2의 n승을 구하는 함수 만들기
		// 단, 재귀호출 방식으로 구현해야 합니다.
		int result = pow2(5);
		
		System.out.println(result);

	}

}
