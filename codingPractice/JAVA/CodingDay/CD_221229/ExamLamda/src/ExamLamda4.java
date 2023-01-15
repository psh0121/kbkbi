interface Calculate4<T>
{
	public T cal(T a, T b);
}

public class ExamLamda4 {
	
	public static <T> void calAndPrint(Calculate4<T> op, T n1, T n2)
	{
		T result = op.cal(n1, n1);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// 2. 4+5를 구하는 코드를 완성하세요. (람다식)
		
		// 객체를 만든다.
		//Calculate8<Integer> cal = (a, b) -> a + b;
		
		calAndPrint((a, b) -> a + b, 4, 5);
	}

}
