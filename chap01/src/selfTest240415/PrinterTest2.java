package selfTest240415;

class Printer2{
	private int numOfPaper = 0;
	
	public Printer2(int numOfPaper) {
		this.numOfPaper = numOfPaper;
	}
	
	public void print(int amount) {
		if(numOfPaper == 0) {
			System.out.println("용지가 없습니다.");
		} else if(numOfPaper < amount) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다.",amount - numOfPaper);
			System.out.println(numOfPaper + "장만 출력합니다.");
			numOfPaper = 0;
		} else {
			numOfPaper -= amount;
			System.out.println();
		}
	}
}

public class PrinterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);
		
	}

}
