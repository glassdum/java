package sec06;

import java.util.Scanner;

public class SelfProject240325n003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		System.out.println("원기둥의 밑변 반지름은? " + a);
		double b = in.nextDouble();
		
		System.out.println("원기둥의 높이는? " + b);
		
		double c = (a * a * 3.14) * b;
		System.out.println("원기둥의 부피는 " + c);
		
		
	}

}
