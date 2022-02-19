package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		   Calculate calc = new Calculate();
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.print("정수(1~9) 입력 (공백으로 구분) : ");
		   int a = Integer.parseInt(sc.next());
		   int b = Integer.parseInt(sc.next());
		   
		   System.out.println("합: " + calc.sum(a, b));
		   System.out.println("차: " + calc.divide(a, b));
		   System.out.println("곱: " + calc.multiply(a, b));
		   System.out.println("나누기: " + calc.divide(a, b));
		   
	}

}
