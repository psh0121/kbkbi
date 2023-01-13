
class Outer		// Outer Class
{
		private static int num = 0;
		
		// static Nested Class
		static class Nested1
		{
			void add(int n)
			{
				num = num + 1;
			}
		}
		
		// static Nested Class
		static class Nested2
		{
			int get()
			{
				return num;
			}
		}
}

public class ExamNestedClass1 {

	public static void main(String[] args) 
	{
		Outer.Nested1 nst1 = new Outer.Nested1();
		
		nst1.add(3);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		
		System.out.println(nst2.get());

	}

}
