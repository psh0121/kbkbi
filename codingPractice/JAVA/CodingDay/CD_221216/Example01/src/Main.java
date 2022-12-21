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

public class Main 
{
	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2)
	{
		T temp;
		temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
	}

	public static void main(String[] args) 
	{
		Box<Integer> box1 = new Box<>();
		Box<Integer> box2 = new Box<>();
		
		box1.set(11);
		box2.set(22);
		
		System.out.println(box1.get()); // 11
		System.out.println(box2.get()); // 22
		
		swapBox(box1, box2);
		
		System.out.println(box1.get()); // 22
		System.out.println(box2.get()); // 11
	}

}
