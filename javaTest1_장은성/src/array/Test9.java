package array;

/**
 * [ 문제 9 ] 
 * 2차원 배열에 들어있는 데이터중 가장 큰 값과 가장 작은 값을 구한다.
 * @author jes
 *
 */
public class Test9 {
	
	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
		int bignum = 0;
		int smallnum = 100;
		
		for(int i = 0; i < array.length; i++) {
			int bigtmp = array[i][0];
			int smalltmp = array[i][0];
			
			// array[i] 안의 숫자들끼리 비교
			for(int j = 1; j < array[i].length; j++) {
				if(array[i][j] > bigtmp) 
					bigtmp = array[i][j];
				if(array[i][j] < smalltmp)
					smalltmp = array[i][j];
			}
			
			// 각 array[i]에서 뽑힌 가장 큰/작은 수들끼리의 비교
			if(bigtmp > bignum)
				bignum = bigtmp;
			if(smalltmp < smallnum)
				smallnum = smalltmp;
		}

		System.out.println("가장 큰 값: " + bignum);
		System.out.println("가장 작은 값: " + smallnum);
	}

}
