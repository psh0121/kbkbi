
public class Main2 {
	
	public static void Increment(Integer n)
	{
		// wrapper지만 프리미티브타입에서 사용하는 연산을 사용할 수 있다.
		n++;
	}

	public static void main(String[] args) 
	{
		int a = 10;
		
		Integer n = a;
		System.out.println(n);
	}
}
