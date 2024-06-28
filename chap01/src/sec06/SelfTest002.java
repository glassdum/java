package sec06;

import java.util.Scanner;

public class SelfTest002 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int n = in.nextInt();
		
		System.out.println(pax(n));
	}
	
	static int pax(int n) {
		int result = 1;
		while(n>0) {
			result *= n;
			n--;
		}
		return result;
	}

}
