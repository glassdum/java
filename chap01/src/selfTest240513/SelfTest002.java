package selfTest240513;

import java.util.Scanner;

public class SelfTest002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		System.out.println("학생의 인원수를 입력하세요.");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int i : scores) {
			System.out.printf("%d ",i);
		}
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println("\n" + (i + 1) + "번 학생의 등급은 A입니다.");
			} else if(scores[i] >= 80) {
				System.out.println((i + 1) + "번 학생의 등급은 B입니다.");
			} else if(scores[i] >= 70) {
				System.out.println((i + 1) + "번 학생의 등급은 C입니다.");
			} else if(scores[i] >= 60) {
				System.out.println((i + 1) + "번 학생의 등급은 D입니다.");
			} else {
				System.out.println((i + 1) + "번 학생의 등급은 F입니다.");
			}
		}
		
		
		in.close();
	}
}
