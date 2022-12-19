public class SSPrinterModel1 implements Printable{

	public boolean init()
	{
		System.out.println("SS-Printer-init");
		return true;
	}
	
	public void print(String doc)
	{
		System.out.println("SS-Printer");
		System.out.println(doc);
	}
}
