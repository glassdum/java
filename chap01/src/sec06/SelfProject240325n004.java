package sec06;

import java.util.Scanner;

public class SelfProject240325n004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a,b,c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		System.out.println("전공 이수 학점 : " + a);
		System.out.println("교양 이수 학점 : " + b);
		System.out.println("일반 이수 학점 : " + c);
		
		System.out.println(a >= 70 & ((b & c) >= 30 || b + c >= 80)?"졸업가능":"졸업불가");
	}

}
