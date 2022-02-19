package ncs.test4;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random() * 50) + 51;
			arr[i] = n;
			
			// 중복제거
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i])
					i--; 
				// 생성한 난수 값이 이전에 넣어뒀던 정수와 중복인 값이 있으면, 반복문이 한번 더 돌 수 있도록 i--를 해준다.
			}
		}
		
		// selection sort
		System.out.println("before: " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j;
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("after: " + Arrays.toString(arr));

	}

}
