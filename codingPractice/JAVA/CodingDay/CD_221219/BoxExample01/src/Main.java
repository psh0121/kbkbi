class Box <T>
{
	private T obj;
	
	public T get() {
		return obj;
	}
	
	public void set(T obj)
	{
		this.obj = obj;
	}
}

// Plastic <-- Toy <-- RobotToy
class Plastic
{
	@Override
	public String toString()
	{
		return "PLASTIC!";
	}
}

class Toy extends Plastic
{	
	@Override
	public String toString()
	{
		return "TOY!";
	}
}

class RobotToy extends Toy
{
	@Override
	public String toString()
	{
		return "ROBOT-TOY!";
	}
}

class BoxHandler
{
	// 메모)
	// Box에 있는 내용을 끄집어내겠다는 의도가 있고 기능이 분명하다.
	// Toy 객체를 보호하고싶고 + readonly의 역할을 유지하고 싶다면
	// <? extends Toy>를 사용하도록 한다.
	// 박스로 접근하는 코드들은 허용하지 않으며(read only)
	// 박스가 참조하는 타입을 대상으로 하는 저장활동은 호출이불가능하다.
	
	// Box<? extneds Toy>
	// ==> box가 참조하는 인스턴스(Type)를 대상으로 get(출력)만 혀용한다.
	public static void outBox(Box<? extends Toy> box)
	{
		// 아예 컴파일 자체에 에러를 유발해서 용도에 벗어난 코딩을 못하게 하도록 하고 싶다.
		// set을 못하게 하고 싶
		
		// set이 불가한 이유)
		// -- Toy박스만 오는 것이 아니라 Toy박스에서 파생된 박스가 올 수도 있는데
		// box에 어떤 값도 셋팅이 불가하다.
		// -- 왜냐하면 셋팅을 하게되면 자기보다 작은 객체가 들어오면 안되는데 들어올 수 있는 가능성이 열려버린다.
		// ==> 결국 뻑이 나버릴 수 있기 때문에 set은 불가하다.
		//box.set(new RobotToy()); (x)
		
		Toy t = box.get();
		
		System.out.println(t);
	}
	
	// 메모)
	// inBox()의 용도는 box에 어떤 값을 설정하려는 것이다.
	// set외에 다른 것은 못하게 제한을 걸고 싶고
	// set외에 다른 것을 사용했을 때 컴파일시점에 에러를 발생하고 싶다면 super를 사용한다.
	// super를 쓰면 해당되는 클래스 이상의 것을 가지고 올 수 있는데 
	// 이는 set은 괜찮지만 박스에 끄집어내는 순간 코드의 안전성이 보장되지 않아 에러를 내보낸다. 
		
	// Box<? super Toy>
	// ==> box가 참조하는 인스턴스(Type)를 대상으로 set(입력)만 혀용한다.
	public static void inBox(Box<? super Toy> box, Toy n)
	{
		box.set(n);
		
		// 목적에 위배되는 행동
		// Box에는 Toy 플라스틱이 오게됨
		// 큰객체안에 작은 객체가 들어갈수 있게 된다는 것이다.(문제발생)
		//Toy a = box.get();
	}
}

public class Main {

	public static void main(String[] args) 
	{
		// 1. Box를 만든다.
		//Box<Toy> tBox = new Box<Toy>();
								
		// 2. Box에 Toy를 집어넣는다. (set)
		//BoxHandler.inBox(tBox, new Toy());
								
		// 3. Box에서 Toy를 빼낸다. (get)
		// BoxHandler.outBox(tBox);
		
		Box<Toy> box = new Box<>();
		
		BoxHandler.inBox(box, new Toy());

	}

}
