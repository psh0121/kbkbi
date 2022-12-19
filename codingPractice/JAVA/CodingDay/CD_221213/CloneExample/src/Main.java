// Point x, y 좌표를 가지고 있는 클래스
// Point 클래스를 구현.. (생성자, getter/setter, equals)

public class Main {

	public static void main(String[] args) 
	{
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);
		
		//System.out.println(p1.equals(p2));
		
		Point pos1 = new Point(10, 20);
		Point pos2 = null;
		try {
			pos2 = (Point)pos1.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(pos1.equals(pos2));
	}

}
