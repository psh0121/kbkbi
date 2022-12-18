
class SuperClass {
	
	public SuperClass()
	{
		System.out.println("SuperClass()");
	}
	
	public SuperClass(int a)
	{
		System.out.println("SuperClass(" + a + ")");
	}
}

class SubClass extends SuperClass {
	public SubClass()
	{
		System.out.println("SubClass()");
	}
	
	public SubClass(int a)
	{
		System.out.println("SubClass(" + a + ")");
	}
}
