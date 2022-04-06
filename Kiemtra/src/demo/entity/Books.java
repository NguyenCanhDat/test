package demo.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Books {
	@NotEmpty(message = "Book bookCode is empty!")
	private	String bookCode ;
	@NotEmpty(message = "Book bookTitle is empty!")
	private	String bookTitle ;
	@NotEmpty(message = "Book author is empty!")
	private	String author ;
	@NotEmpty(message = "Book publishingCompany is empty!")
	private	String publishingCompany ;
	@NotNull(message = "Book publishingYear is empty!")
	private	int publishingYear ;
	@NotNull(message = "Book numberOfPages is empty!")
	private	int numberOfPages ;
	@NotNull(message = "Book price is empty!")
	private	double price ;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(String bookCode, String bookTitle, String author, String publishingCompany, int publishingYear,
			int numberOfPages, double price) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.publishingYear = publishingYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
