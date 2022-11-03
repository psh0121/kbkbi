
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		int dan = 2;
		int mul = 1;
		
		for(int i = 0; i < 8; i++) 
		{
			System.out.println("-----" + dan + "단-----");
			for(int j = 0; j < 9; j++)
			{
				System.out.println(dan + " x " + mul + " = " + (dan * mul));
				mul++;
			}
			dan++;
			mul = 1;
		}

	}

}
