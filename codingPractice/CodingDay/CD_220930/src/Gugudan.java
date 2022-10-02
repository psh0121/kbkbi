
public class Gugudan {

	public static void main(String[] args) 
	{
		// Q) 이중 for문을 2단부터 9단까지 출력하는 코드를 작성하시오.
		int dan = 2; //단수 
		int mul = 1; // 곱수 
		
		// 2단 ~ 9단 까지 출력하기 위한 for
		for(int i = 0; i < 8; i++) 
		{
			System.out.println(dan + "단");
	
			// 곱하는수 9번 돌기위한 for
			for(int j = 0; j < 9; j++) 
			{
				System.out.println(dan + " x " + mul + " = " + (dan * mul));
				
				mul++;
			}
			
			System.out.println("-------------");
			
			dan++;
			mul = 1;
		}

	}

}
