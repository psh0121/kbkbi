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

public class Main {

	public static void main(String[] args) 
	{
		Integer i = 5;
		
		Box<Integer> iBox = new Box<Integer>();
		iBox.set(i);
		
		Box<Box<Integer>> iiBox = new Box<>();
		iiBox.set(iBox);
		
		Box<Box<Box<Integer>>> iiiBox = new Box<>();
		iiiBox.set(iiBox);
		
		int k = iiiBox.get().get().get();
		
		System.out.println(k);

	}

}
