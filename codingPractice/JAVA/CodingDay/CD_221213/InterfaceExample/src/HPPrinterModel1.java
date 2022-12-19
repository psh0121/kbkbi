public class HPPrinterModel1 implements ColorPrintable, PrinterOnly {
	public boolean init()
	{
		System.out.println("HP-Printer-init");
		return true;
	}
	
	public void print(String doc)
	{
		System.out.println("HP-Printer");
		System.out.println(doc);
	}
	
	public void printColor(String doc)
	{
		System.out.println("HP-color-Printer");
		System.out.println(doc);
	}
}
