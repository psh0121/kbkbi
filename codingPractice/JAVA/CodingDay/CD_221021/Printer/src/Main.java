
public class Main {

	public static void main(String[] args) {
		
		HPPrinter hpPrn = new HPPrinter();
		
		hpPrn.initPrinter();
		hpPrn.printBlack("문서");
		
		SSPrinter ssPrn = new SSPrinter();
		
		ssPrn.initPrinter();
		ssPrn.printBlack("그림");

	}

}
