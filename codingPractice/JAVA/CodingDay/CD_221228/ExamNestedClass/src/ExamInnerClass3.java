interface Printable2
{
	public void print();
}

class OfficeMachine2
{
	private String doc;
	
	public OfficeMachine2()
	{
		doc = null;
	}
	
	public OfficeMachine2(String doc)
	{
		this.doc = doc;
	}
	
	public Printable2 getPrinter()
	{
		// inner class -> local inner class (anonymous inner class)
		// member class와 기능적으로 바뀌는게 없다.
		// 위치만 바뀜
		
		// class 클래스명 implements 인터페이스명 { 구현부 }
		// return new 클래스명();
		
		// return new 인터페이스명() { 구현부 }
		
		return new Printable2()
		{
			public void print()
			{
				System.out.println(doc);
			}
		};
	}
}
public class ExamInnerClass3 {

	public static void main(String[] args) 
	{
		OfficeMachine2 om = new OfficeMachine2("제안서 서류");
		
		// Printer클래스와 객체가 감춰진 상황
		Printable2 prn = om.getPrinter();
		
		prn.print();
	}

}
