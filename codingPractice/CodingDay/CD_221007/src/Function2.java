
public class Function2 {

	// 변수 선언 
	private int choice;						// 초이스 
	private double x1, y1, x2, y2;			// 점좌표 
	private double a;						// 기울기 
	private double b;						// y절편 
	
	///////////////////////////////////////////////////
	// Setter
	
	public void setChoice(int choice)
	{
		this.choice = choice;
	}
	
	public void setX1(double x1)
	{
		this.x1 = x1;
	}
	
	public void setY1(double y1)
	{
		this.y1 = y1;
	}
	
	public void setX2(double x2)
	{
		this.x2 = x2;
	}
	
	public void setY2(double y2)
	{
		this.y2 = y2;
	}
	
	public void setA(double a)
	{
		this.a = a;
	}
	
	public void setB(double b)
	{
		this.b = b;
	}
	
	///////////////////////////////////////////////////
	// Getter

	public int getChoice()
	{
		return choice;
	}
	
	public double getX1()
	{
		return x1;
	}
	
	public double getY1()
	{
		return y1;
	}
	
	public double getX2()
	{
		return x2;
	}
	
	public double getY2()
	{
		return y2;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	///////////////////////////////////////////////////
	// Calculate a, b
	
	public void calA()
	{
		if(getChoice() == 1)
		{
			return;
		}
		else if(getChoice() == 2)
		{
			a = (getY2() - getY1()) / (getX2() - getX1());
		}
	}
	
	public void calB()
	{
		b = getY1() - (getA() * getX1());
	}
	
	///////////////////////////////////////////////////
	// Print function
	
	public void printFunction()
	{
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.println("y = 0");
			}
			else {
				System.out.println("y = " + b);
			}
		}
		else {
			if(b == 0)
			{
				System.out.println("y = " + a + "x");
			}
			else if(b < 0)
			{
				System.out.println("y = " + a + "x " + b);
			}
			else
			{
				System.out.println("y = " + a + "x + " + b);
			}
			
		}
	}
	
}
