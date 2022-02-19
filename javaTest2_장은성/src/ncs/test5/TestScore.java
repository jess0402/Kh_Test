package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생 3명의 3과목 성적을 기록할 수 있는 배열
		double[][] score = new double[3][5];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "번 학생 - 세과목의 점수를 입력하세요(공백으로 구분): ");
			System.out.println();
			String[] str = sc.nextLine().split(" ");
			double sum = 0;
			for(int j = 0; j < score[i].length; j++) {
				if(j < score[i].length-2) {
					score[i][j] = Double.parseDouble(str[j]);
					sum += score[i][j];
				}
				else if (j==3)
					score[i][j] = sum;
				else if (j==4)
					score[i][j] = sum/3;
			}
		}
		
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for(int i = 0; i < score.length; i++) {
			System.out.print(i);
			for(int j = 0; j < score[i].length; j++)
				System.out.print("\t" + score[i][j]);
			System.out.println();
		}

	}

}
