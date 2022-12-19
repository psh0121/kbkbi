class INum
{
	private int num;
	
	public INum()
	{
		
	}
	
	public INum(int num)
	{
		this.num = num;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public boolean equal(INum n)
	{
		if(this.num == n.getNum())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// 최소한은 같은 객체여야 사용할 수 있는 것이다. 
		if(obj instanceof INum)
		{
			if(this.num == ((INum)obj).getNum())
			{
				return true;
			}
		}
		return false;
	}
	
}

public class Main {

	public static void main(String[] args) 
	{
		INum a = new INum(5);
		INum b = new INum(5);
		
		if(a.equals(b))
		{
			System.out.println("두개의 숫자는 같습니다.");
		}
		else
		{
			System.out.println("두개의 숫자는 다릅니다.");
		}

	}

}
