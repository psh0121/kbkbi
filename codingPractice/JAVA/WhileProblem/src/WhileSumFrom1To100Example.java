
public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		int i = 0;
		
		while(i < 100) 
		{
			sum = sum + num;
			
			i++;
			num++;
		}
		
		System.out.println("1 ~ 100 합 : " + sum);

	}

}
