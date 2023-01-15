interface Calculate<T>
{
	public T add (T a, T b);
}

public class ExamLamda3 {

	public static void main(String[] args) {
		Calculate<Integer> calcSum = null;
		
		calcSum = (a, b) -> {return a + b;};
		System.out.println(calcSum.add(5, 3));
		
		calcSum = (a, b) -> a + b;
		System.out.println(calcSum.add(5, 3));

	}

}
