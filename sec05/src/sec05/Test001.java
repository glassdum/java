package sec05;

import java.util.Scanner;
import java.util.Random;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int m = 5, n = 10;
		double p = 0.3;
		
		int[][] game1 = new int[m][n];
		double[][] game2 = new double[m][n];
		char[][] game3 = new char[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				game1[i][j] = 0;
				game2[i][j] = random.nextDouble();
				if(game2[i][j] <= p) {
					game3[i][j] = '*';
				} else {
					game3[i][j] = '-';
				}
				System.out.print(game3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(game3[i][j] == '*') {
					if(i == 0) {
						if(j == n-1) {
							game1[i][j-1] += 1;
							game1[i+1][j] += 1;
							game1[i+1][j-1] += 1;
						} else if(j == 0) {
							game1[i][j+1] += 1;
							game1[i+1][j] += 1;
							game1[i+1][j+1] += 1;
						} else {
							game1[i][j+1] += 1;
							game1[i][j-1] += 1;
							game1[i+1][j] += 1;
							game1[i+1][j+1] += 1;
							game1[i+1][j-1] += 1;
						}
					} else if(i == m-1) {
						if(j == n-1) {
							game1[i][j-1] += 1;
							game1[i-1][j] += 1;
							game1[i-1][j-1] += 1;
						} else if(j == 0) {
							game1[i][j+1] += 1;
							game1[i-1][j] += 1;
							game1[i-1][j+1] += 1;
						} else {
							game1[i][j+1] += 1;
							game1[i][j-1] += 1;
							game1[i-1][j] += 1;
							game1[i-1][j+1] += 1;
							game1[i-1][j-1] += 1;
						}
					} else {
						if(j == n-1) {
							game1[i][j-1] += 1;
							game1[i-1][j] += 1;
							game1[i-1][j-1] += 1;
							game1[i+1][j] += 1;
							game1[i+1][j-1] += 1;
						} else if(j == 0) {
							game1[i][j+1] += 1;
							game1[i-1][j] += 1;
							game1[i-1][j+1] += 1;
							game1[i+1][j] += 1;
							game1[i+1][j+1] += 1;
						} else {
							game1[i][j+1] += 1;
							game1[i][j-1] += 1;
							game1[i-1][j] += 1;
							game1[i-1][j+1] += 1;
							game1[i-1][j-1] += 1;
							game1[i+1][j] += 1;
							game1[i+1][j+1] += 1;
							game1[i+1][j-1] += 1;
						}
					}
				}
				
				if(game3[i][j] == '*') {
					System.out.print(game3[i][j] + " ");
				} else {
					System.out.print(game1[i][j] + " ");
				}
			}
			System.out.println("");
		}
		
		
		
		
		
		in.close();
	}

}
