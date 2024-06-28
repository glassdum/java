package sec05;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int remainder = 25 % 2;
		System.out.println("25 / 2의 나머지는 " + remainder + " 입니다.");
		
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d / %d의 나머지는 %d입니다.",x,y,x%y);
	}

}
