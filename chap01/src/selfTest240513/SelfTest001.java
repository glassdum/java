package selfTest240513;

import java.util.Scanner;

public class SelfTest001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int i = 0; i<scores.length; i++) {
			System.out.printf("%d ",scores[i]);
		}
		
		
		in.close();
	}

}
