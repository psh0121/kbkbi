
public class Main {

	public static void main(String[] args) 
	{
		// 선이 쭉가있는데 웬만하면 쓰지 말라는 소리
		Integer iInst = new Integer(3);		
		Double dInst = new Double(3.14);
				
		// 객체화시킨걸 프리미티브타입으로 다시 끄집어냄
		int a = iInst.intValue();
						
		System.out.println(iInst);
		System.out.println(dInst);
						
		System.out.println(a);
				
		// 개발버전 - 자바는 개발자가 뭘하는걸 싫어해, 그래서 자바가 알아서 해줘
		Integer iObj = 10;
		System.out.println(iObj);
				
		int i = iObj;
		System.out.println(i);
	}
}
