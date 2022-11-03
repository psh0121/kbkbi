
public class ContiueExample {

	public static void main(String[] args) {
		
		int num = 1;
		
		for(int i = 0; i < 10; i++)
		{
			if(num % 2 != 0)
			{
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}

	}

}
