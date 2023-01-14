// Inner Class : Non-static nested class
	// 1. member inner class
	// 2. local inner class
	// 3. anonymous inner class

class Outer2
{
	private int num = 0;
	
	// member inner class
	class MemberInner
	{
		void add (int a)
		{
			num += a;
		}
		
		int get()
		{
			return num;
		}
	}
}

public class ExamInnerClass1 {

	public static void main(String[] args) 
	{
		Outer2 out1 = new Outer2();
		Outer2 out2 = new Outer2();
		
		// new라는 연산자는 inner class를 사용할 수 없다.
		// => num이 MemberInner에 없기 때문에 달랑 MemberInner클래스 객체를 생성할 수 없다.
		// => Outer 클래스에 종속되어 있기 떄문에 Outer 클래스 객체를 만들어야 MemberInner 클래스 객체를 만들 수 있다.
		// out1.new MemberInner() : out1에 속해있는 new라고 생각하면 이해하기 수월하다. 
		
		// Object에 new라는 키워드는 없지만 new키워드를 사용하기 위해서는 out1객체를 기반으로 사용해야한다.
		// = MemberInner 만들 때 누구 소속으로 만들것인가?
		
		// Outer의 객체를 전제로하여 MemberInner 클래스 객체를 생성할 수 있다.
		// 객체를 생성하게되면 참조값이 리턴된다.
		
		// out1을 기반으로 인스턴스를 생성한다. 
		Outer2.MemberInner out1mi1 = out1.new MemberInner();
		Outer2.MemberInner out1mi2 = out1.new MemberInner();
		
		Outer2.MemberInner out2mi1 = out2.new MemberInner();
		Outer2.MemberInner out2mi2 = out2.new MemberInner();
		
		out1mi1.add(3);
		System.out.println(out1mi1.get());	//3
		
		out1mi2.add(2);
		System.out.println(out1mi1.get());	//5

	}

}
