package array;

/**
 * [ 문제 10 ]
 * 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원배열에 기록하고 출력한다. 
 * 단 중복 값은 하나만 기록되게 한다.
 * @author jes
 *
 */
public class Test10 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int[] copyAr = new int[array.length*array[0].length];
		int n = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			loop1: 
			for(int j = 0; j < array[i].length; j++) {
				
				// array에서 3의 배수만 골라내기
				if(array[i][j] % 3 == 0) {	
					// 중복검사
					for(int k = 0; k < copyAr.length; k++) {
						if(array[i][j] == copyAr[k])
							continue loop1;
					}
					copyAr[n++] = array[i][j];
				}
			}
		}
		// 출력
		System.out.print("copyAr :");
		for(int i = 0; i < copyAr.length; i++) {
			if(copyAr[i] != 0)
				System.out.printf(" %d", copyAr[i]);
		}

	}

}
