package sec05;

import java.util.Scanner;

public class CompLogicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x = 0, y = 1;
		System.out.println((x < 1) || (y--<1));
		System.out.println("x = " + x + " y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x<1)|(y--<1));
		System.out.println("x = " + x + " y = " + y);
		
		int a = in.nextInt();
		int b = in.nextInt();
		b--;
		System.out.println((a < 10) || (b > 10));

		System.out.printf("%d = %d, %d = %d",a,a,++b,b);
		
		
		
	}

}
