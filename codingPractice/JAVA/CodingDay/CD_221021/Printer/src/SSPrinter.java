
public class SSPrinter implements Printable{
	
	SSPrinter()
	{
		
	}
	
	public boolean initPrinter()
	{
		System.out.println("SSPrinter init");
		return true;
	}
	
	public boolean printBlack(String doc)
	{
		System.out.println("SSPrinter black print" + doc);
		return true;
	}

}
