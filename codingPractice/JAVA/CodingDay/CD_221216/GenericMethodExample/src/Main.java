class Box <T>
{
	private T obj;
	
	public void set (T obj)
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
	public static <T> Box<T> makeBox(T obj)
	{
		Box<T> box = new Box<>();
		box.set(obj);
		
		return box;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Box<String> ssBox = new Box<>();
		
		// 정상적코드
		// Box2<String> sBox = BoxFactory.<String>makeBox(new String("Hello"));
		
		// 슈가코드
		Box<String> sBox = BoxFactory.makeBox(new String("Hello"));
		System.out.println(sBox.get());

	}

}
