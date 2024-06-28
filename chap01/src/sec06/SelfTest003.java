package sec06;

import java.util.Scanner;

public class SelfTest003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int n = in.nextInt();
		System.out.println(factorial(n));
		int x = in.nextInt();
		System.out.println(factorial(n,x));
	}
	
	static int factorial(int n) {
		int result = 1;
		while(n>0) {
			result *= n;
			n--;
		}
		return result;
	}
	static int factorial(int n, int x) {
		int r = 1;
		
		while(n<=x) {
			r *= n++;
		}
		return r;
	}
}
