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

class Toy
{	
	@Override
	public String toString()
	{
		return "TOY!";
	}
}

class Robot
{
	@Override
	public String toString()
	{
		return "ROBOT!";
	}
}

class BoxHandler
{
	// 아래의 경우 오버로딩이 안됨 ==> 컴파일러는 타입이 다름에도 불구하고 중복된다고 생각한다.
	// Box<? extends Toy>에서 Box와 ? extends Toy를 뜯어내고 Box를 보고 판단한다.
	// 왜냐하면 뒷부분은 컴파일 시점에서 모르고 호출되고 나서 결정이 나서 컴파일시점에서는 어떤타입인지 모른다.
	// 컴파일러 입장에서는 뒤에는 현재 해석이 불가능해 뒤에는 제끼고 앞에만 보고 같다고 생각해서 오버로딩이 안되어 버린다.
	// 그렇기 때문에 와일드 카드를 사용해 조건에 맞게 작성해주면 좋다.
	
//	public static void outBox(Box<? extends Toy> box)
//	{
//		
//	}
//	
//	public static void outBox(Box<? extends Robot> box)
//	{
//		
//	}
	
	// 1. box를 Box<Toy>도 받고 싶고, Box<Robot>도 받고 싶다.
	// 2. set은 안되게끔 제한조건을 두고 싶다.
	public static <T> void outBox(Box<? extends T> box)
	{
		
	}
}

public class Main {

	// from은 get만 하고 싶다 => extends
	// to는 set만 하고 싶다 => super
	public static <Toy> void moveBox(Box<? super Toy> to, Box<? extends Toy> from)
	{
		Toy temp = from.get();
		to.set(temp);			
	}

	public static void main(String[] args) {
		
		Box<Toy> box1 = new Box<>();
		Box<Toy> box2 = new Box<>();
		
		box1.set(new Toy());
		
		moveBox(box2, box1);
		
		//System.out.println(box1.get());
		System.out.println(box1.get());
	}
}
