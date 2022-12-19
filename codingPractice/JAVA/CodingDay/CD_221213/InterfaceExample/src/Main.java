
public class Main {

	// 1. Printable 규약의 리스트로 되어있는 원형들을 통해서 HP, SP의 기능들을 호출하겠다.
	// ==> 인터페이스에 없는 기능은 불러오지 않겠다.
	
	// 2. 제어할 수 있는 길이 하나로 통일 
	
	public static void main(String[] args) 
	{
		Printable hpPrinter = new HPPrinterModel1();
		Printable ssPrinter = new SSPrinterModel1();
		
		Printable[] printers = new Printable[2];
		
		printers[0] = hpPrinter;
		printers[1] = ssPrinter;
		
		for(int i = 0; i < printers.length; i++)
		{
			printers[i].init();
			printers[i].print("abc");
		}

	}

}
