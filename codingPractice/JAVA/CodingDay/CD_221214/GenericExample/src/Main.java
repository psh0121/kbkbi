class Apple
{
	@Override
	public String toString()
	{
		return "🍎🍎🍎🍎🍎";
	}
}

class Orange
{
	@Override
	public String toString()
	{
		return "🍊🍊🍊🍊🍊";
	}
}

class Box <T>
{
	private T obj;
	
	// 기본생성자
	public Box()
	{
		obj = null;
	}
	
	// 오버로딩된 생성자
	public Box(T obj)
	{
		this.obj = obj;
	}
	//////////////////////////////
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
	
	@Override
	public String toString()
	{
		return "Box[" + obj.toString() + "]";
	}
}


class DoubleBox <L, R>
{
	private L left;		
	private R right;	
	
	// 기본생성자
	public DoubleBox()
	{
		left = null;
		right = null;
	}
	
	// 오버로딩된 생성자
	public DoubleBox(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	//////////////////////////////////////////
	
	public void set(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	public L getLeft()
	{
		return left;
	}
	
	public R getRight()
	{
		return right;
	}
	
	public void setLeft(L left)
	{
		this.left = left;
	}
	
	public void setRight(R right)
	{
		this.right = right;
	}
	
	@Override
	public String toString()
	{
		return "DoubleBox[" + left.toString() + " : " + right.toString() + "]";
	}
}

public class Main {

	public static void main(String[] args) 
	{
		// STEP01> 과일 객체 생성
		Orange orange = new Orange();
		Apple apple = new Apple();
		
//		System.out.println(orange);
//		System.out.println(apple);
//		System.out.println("=============================================");
		
		// STEP02> 각 과일에 대한 박스객체 생성
		Box<Orange> orgBox = new Box<Orange>();
		Box<Apple> appleBox = new Box<Apple>();
		
		// 박스안에 각각의 과일 넣어주기
		orgBox.set(orange);
		appleBox.set(apple);
		
//		System.out.println(orgBox);
//		System.out.println(appleBox);
//		System.out.println("=============================================");
		
		// STEP03> 더블박스에 대한 객체 생성
		DoubleBox<Box<Orange>, Box<Apple>> doubleBox = new DoubleBox<Box<Orange>, Box<Apple>>();
		
		// 더블박스안에 박스들 넣어주기
		doubleBox.set(orgBox, appleBox);
		
		// toString()
		System.out.println(doubleBox);
		
		///////////////////////////////////////////////////////////////////////
		
		// 1-1. AppleBox를 끄집어낸다.
		Box<Apple> outAppleBox = doubleBox.getRight();
		System.out.println("사과박스를 끄집어내자 : " + outAppleBox);
		
		// 1-2. Apple을 끄집어낸다.
		Apple outApple = outAppleBox.get();
		System.out.println("사과를 끄집어내자 : " + outApple);
		
		// 2-1. OrangeBox를 끄집어낸다.
		Box<Orange> outOrangeBox = doubleBox.getLeft();
		System.out.println("오렌지박스를 끄집어내자 : " + outOrangeBox);
		
		// 2-2. Orange를 끄집어낸다.
		Orange outOrange = outOrangeBox.get();
		System.out.println("오렌지를 끄집어내자 : " + outOrange);
	}

}
