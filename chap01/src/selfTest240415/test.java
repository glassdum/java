package selfTest240415;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean and, or;
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		and = x%4==0&&x%5==0;
		or = x%4==0||x%5==0;
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(and==false&&or==true?true:false);
		
	}

}
