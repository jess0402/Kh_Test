package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		String str = args[0];
		
		char[] chArr = str.toUpperCase().toCharArray();
		
		for(int i = chArr.length-1; i >= 0; i--)
			System.out.print(chArr[i]);
		 
	}

}
