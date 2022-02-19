package com.calc;

/**
 * [ 문제 4 ]
 * main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 4칙연산 결과를 출력한다.   
 * 입력값은 모두 int형으로 처리한다. 
 * @author jes
 */
public class Calculator {

	public static void main(String[] args) {
		int bignum = Integer.parseInt(args[0]);
		int smallnum = Integer.parseInt(args[1]);
		int tmp;
		
		if(smallnum > bignum) {
			tmp = bignum;
			bignum = smallnum;
			smallnum = tmp;
		}
		
		System.out.println("합 : " + (bignum + smallnum));
		System.out.println("차 : " + (bignum - smallnum));
		System.out.println("곱 : " + (bignum * smallnum));
		
		if(smallnum == 0 || smallnum < 0)
			System.out.println("나누기 : 0");
		else
			System.out.println("나누기 : " + (bignum / smallnum));

	}

}
