
class MaxAmountException extends Exception
{
	public MaxAmountException(String value)
	{
		super(value);
	}
}

public class BankMain {

	public static void main(String[] args) 
	{
		BankAccount b1 = null;
		
		try
		{
			b1 = new BankAccount(3000000);
			
			System.out.println(b1.deposit(50));
			
			int a = b1.getBalance();
			
			System.out.println(a);
		}
		
		catch(MaxAmountException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
