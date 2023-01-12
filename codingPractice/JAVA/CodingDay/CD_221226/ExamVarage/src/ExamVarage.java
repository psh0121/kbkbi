
public class ExamVarage 
{
	public static void printAll (String ...vars)
	{
		System.out.println("Length = " + vars.length);
		
		for(String s : vars)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) 
	{
		printAll("A");
		printAll("A", "B");
		printAll("A", "B", "C");
	}

}
