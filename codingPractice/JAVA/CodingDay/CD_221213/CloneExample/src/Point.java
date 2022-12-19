public class Point implements Cloneable // 마커인터페이스 - 의미부여
{
	private int x;
	private int y;
	
	// 기본생성자
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	// 오버로딩된 생성자
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//////////////////////////////////////
	// getter, setter
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	//////////////////////////////////////
	
	@Override
	public boolean equals (Object obj)
	{
		// 먼저, 같은 객체인지에 대해서 판단
		if(obj instanceof Point)
		{
			// point casting
			if((this.x == ((Point)obj).getX()) &&
			    (this.y == ((Point)obj).getY()))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public Point clones()
	{
		// 1. 새로운 Point 객체를 하나 만든다.
		// 2. 새로만든 포인트 객체의 값을 설정한다.
		Point cloneObj = new Point(this.x, this.y);
		
		return cloneObj;
	}
	
	// 원형
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		// (Object)(new Point(this.x, this.y))
		return super.clone();
		
		// object class의 clone을 불러온거임.
		// 상위 클래스에서 내가 가지고 있는 내 실제객체와 완전히 동일한 객체를
		// 기계적으로 만들어버림
	}
	
}