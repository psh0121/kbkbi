
public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		for(int i = 0; i < 100; i++)
		{
			sum = sum + num;
			num++;
		}
		
		System.out.println("1 ~ 100 합 : " + sum);

	}

}
