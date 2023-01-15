interface Printable
{
	public void print();
}

class OfficeMachine
{
	private String doc;
	
	public OfficeMachine()
	{
		doc = null;
	}
	
	public OfficeMachine(String doc)
	{
		this.doc = doc;
	}
	
	public Printable getPrinter()
	{
		return new Printer();
	}
	
	// Member inner class
	// Printer 클래스를 감추겠다는 의도가 있기 때문에 이를 Inner 클래스로 만들었다.
	private class Printer implements Printable
	{
		public void print()
		{
			System.out.println(doc);
		}
	}
}
public class ExamInnerClass2 {

	public static void main(String[] args) 
	{
		OfficeMachine om = new OfficeMachine("견적서 서류");
		
		// Printer 클래스와 Printer 객체가 감춰진 상황 
		Printable prn = om.getPrinter();
		
		prn.print();
	}

}
