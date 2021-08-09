package Ex7Inheritence;

public class Book {
	protected String title;
	protected String author;
	protected double price;
	
	private final double expensive_price = 150;
	 // default c`tor
	public Book() {
		this.title="myTitle";
		this.author="myAuthor";
		this.price = 99.99;
	} 
	//co`tor 
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		setPrice(price);
	}
	//setters and getters :
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return Math.abs(price);
		
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getExpensive_price() {
		return expensive_price;
	}
	//to String function:
	public String toString() {
		return "Book :(title=" + title + ", author=" + author + ", price=" + price + ")";
	}
	//check if the book is expensive 
	public boolean isExpensive() {
		return (price > expensive_price);
	}
	
	
	

	
	

}
