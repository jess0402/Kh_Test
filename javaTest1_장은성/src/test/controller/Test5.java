package test.controller;

import java.util.Scanner;

/**
 * [ 문제 5 ]
 * 키보드로 2개의 정수형 데이터를 입력받아, 두 수가 모두 1부터 9까지의 수일 때만 
 * 두 수의 곱이 한자리 수인지 두 자리 수인지를 출력한다.
 * @author jes
 *
 */
public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		if(num1>=1 && num1<=9 && num2 >=1 && num2 <=9) {
			if(Integer.toString(num1*num2).length()==1)
				System.out.println("한자리 수 입니다.");
			else
				System.out.println("두자리 수 입니다.");
		}


	}

}
