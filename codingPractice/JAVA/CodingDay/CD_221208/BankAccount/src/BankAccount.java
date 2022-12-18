// 은행계좌, 잔액, 최대잔액
// 입금(), 출금(), 조회()

public class BankAccount 
{
	private int balance;
	final int MAX_AMOUNT = 1000000;
	
	public BankAccount() 
	{
		balance = 0;
	}
	
	public BankAccount(int amount) throws MaxAmountException
	{
		if(amount > MAX_AMOUNT)
		{
			// 생성자 생성하지 않을 것 ==> 예외처리
			throw new MaxAmountException("최대금액을 초과하셨습니다.");
		}
		
		balance = amount;
	}
	
	// 입금()
	public int deposit(int amount)
	{
		int temp = balance + amount;
		
		if(temp <= MAX_AMOUNT)
		{
			balance += amount;
			return balance;
		}
		
		return -1;
	}
	
	// 출금()
	public int withdraw(int amount)
	{
		if(balance >= amount)
		{
			balance -= amount;
			return balance;
		}
		
		return -1;
	}
	
	// 잔액조회()
	public int getBalance()
	{
		return balance;
	}

}
