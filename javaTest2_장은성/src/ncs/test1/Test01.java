package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 점수를 입력하세요(공백으로 구분) : ");
		
		String[] arr = sc.nextLine().split(" ");  
		double[] scores = new double[arr.length];

		
		if(arr.length != 5) {
			System.out.println("다시 입력하세요.");
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			scores[i] = Double.parseDouble(arr[i]);
			if(scores[i] < 10 || scores[i] > 99) {
				System.out.println("다시 입력하세요.");
				return;
			}
		}
		
		double totalscore = (scores[0] + scores[1])/2 * 0.6
						  + (scores[2] + scores[3])/2 * 0.2
						  + scores[4] * 0.2;
		
		String Class;
		if(totalscore >= 90)
			Class = "Gold Class";
		else if(totalscore >= 80)
			Class = "Silver Class";
		else if(totalscore >= 70)
			Class = "Bronze Class";
		else
			Class = "Normal Class";
		
		System.out.println("평가점수: " + totalscore + "점");
		System.out.println("Class: " + Class);

	}

}
