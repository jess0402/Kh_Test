package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		
		// Tv 객체를 3개 생성하여 배열에 넣는다.
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		// 배열에 있는 객체 정보를 모두 출력 한다. – for 문을 이용 할 것
		for(int i = 0; i < tvArray.length; i++)
			System.out.println(tvArray[i].toString());
		
		// 실행 결과와 같이 출력
		Tv expensive = tvArray[0];
		Tv cheap = tvArray[0];
		
		for(int i = 1; i < tvArray.length; i++) {
			if(tvArray[i].getPrice() > expensive.getPrice()) {
				expensive = tvArray[i];
			}
			else if(tvArray[i].getPrice() < cheap.getPrice()) {
				cheap = tvArray[i];
			}
			
		}
		
		System.out.println("가격이 가장 비싼 제품: " + expensive.getName());
		System.out.println("가격이 가장 저렴한 제품: " + cheap.getName());

	}

}
