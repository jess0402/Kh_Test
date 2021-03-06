package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		Book bookArray [] = new Book[5];
		
		// Book 객체를 5개 생성하여 배열에 넣는다.
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Nobel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Nobel", "cloven hoof", 50000, 15);
		
		// 배열에 있는 객체 정보를 실행결과 형식으로 모두 출력한다.
		double sum = 0;
		for(int i = 0; i < bookArray.length; i++) {
			System.out.printf("%s\t%s\t%.1f원\t%.1f%%\n",
							  bookArray[i].getCategory(),
							  bookArray[i].getBookName(),
							  bookArray[i].getBookPrice(),
							  bookArray[i].getBookDiscountRate());
			// 책 할인가 구하기
			double dcprice = bookArray[i].getBookPrice() * (100 - bookArray[i].getBookDiscountRate())/100;
			sum += dcprice;
		}
		System.out.println();
		System.out.println("책 가격의 합: " + sum + "원");
	}

}
