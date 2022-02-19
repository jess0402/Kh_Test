package ncs.test8;

import ncs.test7.Book;

public class BookUpdater {
	private Book bookData;

	public BookUpdater() {
		super();
	}

	public BookUpdater(Book bookData) {
		super();
		this.bookData = bookData;
	}

	public Book getBookData() {
		return bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	public void updateBookPrice() {
		double dcprice = this.bookData.getBookPrice() * ((100 - this.bookData.getBookDiscountRate()) / 100);
		this.bookData.setBookPrice(dcprice);
	}
	
}
