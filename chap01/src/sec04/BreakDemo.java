package sec04;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 5;
		while(true) {
			System.out.print(i++);
			if(i>=j) {
				break;
			}
		}
	}

}
