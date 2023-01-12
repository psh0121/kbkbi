
public class ExamVarage2 {
	public static void add(Integer ...vals)
	{
		int result = 0;
		
		for(Integer a : vals)
		{
			result += a;
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		// n개의 숫자를 입력받아 더해주는 함수를 만들어보세요. 
		add(1);
		add(2, 3);
		add(4, 6, 7);
	}

}
