
interface Eatable
{
	public String eat();
}

interface Showable
{
	public String show();
}

class Apple implements Eatable, Showable {
	
	public String eat()
	{
		return "사과는 맛있어";
	}
	
	public String show()
	{
		return "사과는 멋져";
	}
}

class Orange implements Eatable, Showable {
	
	public String eat()
	{
		return "오렌지는 맛있어";
	}
	
	public String show()
	{
		return "오렌지는 멋져";
	}
}

class Box1 <T extends Eatable & Showable>
{
	private T obj;
	
	public T get() {
		System.out.println(obj.eat());
		System.out.println(obj.show());
		return obj;
	}
	
	public void set(T obj)
	{
		this.obj = obj;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Apple ap = new Apple();
		System.out.println(ap.show());
		
		Box1<Orange> oBox = new Box1<>();
		oBox.set(new Orange());
		
		oBox.get();

	}

}
