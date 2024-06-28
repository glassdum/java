package selfTest240415;

class Printer{
	int numOfPaper = 0;
	//int print = 0;
	public void print(int amount) {
		//this.numOfPaper = amount;
		
		//this.print = numOfPaper - amount;

		//System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n",print,numOfPaper);
		
		numOfPaper -= amount;
		
	}
}

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p = new Printer();
		p.numOfPaper = 100;
		p.print(70);
		System.out.println(p.numOfPaper);
		
	}

}
