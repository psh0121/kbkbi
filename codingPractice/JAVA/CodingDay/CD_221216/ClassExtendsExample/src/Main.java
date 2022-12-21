class Box1 <T>
{
	protected T obj;
	
	public T get() {
		return obj;
	}
	
	public void set(T obj)
	{
		this.obj = obj;
	}
}

class SteelBox<T> extends Box1<T>
{
	public SteelBox(T obj)
	{
		this.obj = obj;
	}
}

public class Main {

	public static void main(String[] args) 
	{
		SteelBox<Integer> box1 = new SteelBox<Integer>(23);
		Box1<Integer> box2 = new SteelBox<Integer>(0);
		
		// Box<Number> box3 = new Box<Integer>(); ==> 불가능
		// Box<Number>와 Box<Integer>와는 아무런 관계가 없다.
		// ==> 리스코프치환의 법칙같아 보이지만 둘과는 상속관계(부모자식관계)가 아니다
		
		// Box<Number> box4 = new SteelBox<Integer>(3); ==> 불가능
		// Box<Integer> box5 = new SteelBox<Integer>(3); ==> 가능
	}

}
