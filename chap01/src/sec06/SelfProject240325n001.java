package sec06;

import java.util.Scanner;

public class SelfProject240325n001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		
		double w, h, area;
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		area = w * h;
		System.out.printf("직사각형의 넓이는 %f입니다",area);
		
		int a = in2.nextInt();
		System.out.println((a%2==0)?"짝수":"홀수");
	}

}
