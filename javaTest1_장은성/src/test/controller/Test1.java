package test.controller;

import java.util.Scanner;

/**
 * [  문제  1 ] 
 * 키보드로 1개의 정수형(int) 데이터를 입력 받아, 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리한다.
 * @author jes
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
			if(num % 2 == 0)
				System.out.println("2의 배수입니다.");
			else
				System.out.println("2의 배수가 아닙니다.");
		}

	}

}
