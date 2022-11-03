
public class HPPrinter implements Printable {
	
	public HPPrinter()
	{
		
	}
	
	public boolean initPrinter()
	{
		System.out.println("HPPrinter init");
		return true;
	}
	
	public boolean printBlack(String doc)
	{
		System.out.println("HPPrinter black print" + doc);
		return true;
	}

}
