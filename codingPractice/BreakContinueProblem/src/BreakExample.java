
public class BreakExample {

	public static void main(String[] args) {
		
		while(true)
		{
			int random = (int)(Math.random() * 6) + 1;
			
			System.out.println(random);
			
			if(random == 6)
			{
				break;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
