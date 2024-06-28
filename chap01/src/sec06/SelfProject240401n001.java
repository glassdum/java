package sec06;

import java.util.Scanner;

public class SelfProject240401n001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int a = in.nextInt();
		
		String b;
		
		if(a>=90) {
			if(a>=96) {
				b = "A+";
			} else if(a>=92) {
				b = "A0";
			} else {
				b = "A-";
			}
		} else if(a>=80) {
			if(a>=86) {
				b = "B+";
			} else if(a>=82) {
				b = "B0";
			} else {
				b = "B-";
			}
		} else if(a>=70) {
			if(a>=76) {
				b = "C+";
			} else if(a>=72) {
				b = "C0";
			} else {
				b = "C-";
			}
		} else if(a>=60) {
			if(a>=66) {
				b = "D+";
			} else if(a>=62) {
				b = "D0";
			} else {
				b = "D-";
			}
		} else {
			b = "F";
		}
		
		System.out.println("당신의 학점은 " + b);
	}
}