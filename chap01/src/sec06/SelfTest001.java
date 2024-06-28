package sec06;

import java.util.Scanner;

public class SelfTest001 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int n = in.nextInt();
		int result = 1;
//		while(n>0) {
//			result *= n;
//			n--;
//		}
		while(true) {
			if(n>0) {
				result *= n--;
			} else {
				break;
			}
		}
		System.out.println(result);
	}
	

}
