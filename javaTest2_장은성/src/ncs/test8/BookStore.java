package ncs.test8;

import ncs.test7.Book;

public class BookStore {

	public static void main(String[] args) {
	    Book bookdata;   
        BookUpdater bookupdate;   
        
        // Book 객체 생성
        bookdata = new Book("IT", "HTML5", 30000, 15);
        
        // Book 객체 기본 정보 출력
        System.out.println("기본 정보");
        System.out.println(bookdata.getBookName() + "\t" + bookdata.getBookPrice());
        
        // BookUpdate 객체 생성 
        bookupdate = new BookUpdater(bookdata);
        
        // updateBookPrice 함수를 통해 Book객체의 할인율을 적용시켜 가격 변경
        bookupdate.updateBookPrice();
        
        // Book 객체의 변경된 정보 출력
        System.out.println("변경된 정보");
        System.out.println(bookdata.getBookName() + "\t" + bookdata.getBookPrice());

	}

}
