import java.util.Scanner;

class ReadValueException extends Exception
{
	public ReadValueException() 
	{
		super("음수가 입력되었습니다.");
	}
}

public class Main {
	
	public static int readValue() throws ReadValueException
	{
		Scanner kbScan = new Scanner(System.in);
		
		int val = kbScan.nextInt();
		
		if(val < 0)
		{
			// 예외발생 
			throw new ReadValueException();
		}
		
		return val;
	}

	public static void main(String[] args) 
	{
		int a = 0;
		
		try
		{
			a = readValue();
		}
		
		catch(ReadValueException e)
		{
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("입력값 = " + a);
	}

}
