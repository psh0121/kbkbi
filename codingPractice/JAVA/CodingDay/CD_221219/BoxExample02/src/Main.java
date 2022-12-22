class Box <T>
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
	
	public T get() {
		return obj;
	}
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	@Override
	public String toString()
	{
		return obj.toString();
	}
}

class Unboxer
{
	// 상한제한 (위쪽으로는 못가)
	public static void peekBox(Box<? extends Number> box)
	{
		System.out.println(box);
	}
	
	public static void peekBox2(Box<? super Integer> box)
	{
		System.out.println(box);
	}
}

public class Main {

	public static void main(String[] args) {
		Unboxer.peekBox(new Box<Integer>(1));
		
		Unboxer.peekBox2(new Box<Object>(new Object()));
		
		Box<Number> nBox = new Box<Number>();
		nBox.set(new Integer(11));
		
		Unboxer.peekBox2(nBox);
		
		Box<Integer> iBox = new Box<Integer>(2);
		Unboxer.peekBox2(iBox);
	}

}
