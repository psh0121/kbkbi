class Box<T>
{
	private T obj;
	
	public Box()
	{
		obj = null;
	}
	
	public Box(T obj)
	{
		this.obj = obj;
	}
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
}

class BoxFactory
{
	public static <T> Box<T> makeBox()
	{
		Box<T> box = new Box<T> ();
		return box;
	}
	
	public static <T> Box<T> makeBox(T obj)
	{
		Box<T> box = new Box<T> ();
		return box;
	}
}

public class Main {
	public static void main(String[] args) 
	{
		// 1. Target-type이 정해지지 않는 구형 자바(JAVA5 이하)
		Box<Integer> aBox = BoxFactory.<Integer>makeBox(20);
		
		// 2. Target-type이 만들어진 자바 (JAVA7 이상)
		Box<Integer> iBox = BoxFactory.makeBox(20); // makeBox의 <Integer>는 TargetType
		iBox.set(30);
		
		// 3. 파라미터가 없을때 옆의 녀셕을 보고 타입을 추론한다.
		Box<Double> dBox = BoxFactory.makeBox(); // TargetType 여기를 봐서 안보면 저기를 봐서 만든다.
				
		System.out.println(iBox.get());
	}
}
