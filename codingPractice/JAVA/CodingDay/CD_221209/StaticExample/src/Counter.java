
public class Counter {
	// 변수는 public으로 하면 안됨 ==> static이라고 할지라도 
	private static int count;
	
	// 초기값 설정
	static
	{
		count = 0;
	}
	
	// getter
	public static int getCount()
	{
		return Counter.count;
	}
	
	// setter
	// 외부에서는 호출이 안되지만 내부에선 호출이 가능
	// 장점 => getter에 걸맞는 setter가 만들어진것
	// 		private로 내부에서만 접근반응하도록 설정된
	private static void autoIncrement()
	{
		Counter.count = Counter.count + 1;
	}
	
	Counter()
	{
		Counter.autoIncrement();
	}
}
