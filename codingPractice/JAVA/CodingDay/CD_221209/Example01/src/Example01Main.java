
// 2차 방적식이 주어졌을 때 근을 구하는 클래스를 구현하시오
//	- 2차방정식은 ax^2+bx+c = 0이라 가정
//	- a, b, c는 생성자로 설정
//	- 근을 리턴하는 함수 필요

public class Example01Main {

	public static void main(String[] args) 
	{
		QuadraticEq q = new QuadraticEq(2, 4, -2);
		Root rt;
		
		boolean result = q.calcRoot();
		
		if(result == true)
		{
			rt = q.getRoot();
			System.out.println(rt.getRoot1());
			System.out.println(rt.getRoot2());
		}
		else
		{
			System.out.println("실근이 존재하지 않습니다.");
		}
	}

}
