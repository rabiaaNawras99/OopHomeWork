package Ex7Inheritence;

import java.util.ArrayList;

public class BookStore {
	private String address ;
	private ArrayList<EducationalBook> eduBooks;
	private ArrayList<CookBook> cookBooks;
	
	
	public BookStore(String address) {
		setAddress(address);
		this.eduBooks=new ArrayList<>();
		this.cookBooks=new ArrayList<>();
	}
	public void addEduBook(EducationalBook book) {
		eduBooks.add(book);
	}
	public void addCookBook(CookBook book) {
		
		cookBooks.add(book);
	}
	
	//setters and getters :
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<EducationalBook> getEduBooks() {
		return eduBooks;
	}
	public void setEduBooks(ArrayList<EducationalBook> eduBooks) {
		this.eduBooks = eduBooks;
	}
	public ArrayList<CookBook> getCookBooks() {
		return cookBooks;
	}
	public void setCookBooks(ArrayList<CookBook> cookBooks) {
		this.cookBooks = cookBooks;
	}
	
	
	public ArrayList<CookBook> findCheapCookBooks(int price){
ArrayList<CookBook> res = new ArrayList<CookBook>();
		for (CookBook book : cookBooks) {
			if(book.getPrice() < price) {
				res.add(book);
			}
		}
		return res;
		
	}
	
	

	public void printAll() {
		for (CookBook book : cookBooks) {
			System.out.println(book.toString());
		}
		for (EducationalBook book : eduBooks) {
			System.out.println(book.toString());

		}
		
	}
	
	
	public int countExpensive() {
		int counter = 0;
		for (CookBook book : cookBooks) {
			if(book.isExpensive()) {
				counter++;
			}
		}
		for (EducationalBook book : eduBooks) {
			if(book.isExpensive()) {
				counter++;
			}

		}
		return counter;
	}
	
	
	
	
	
	
	
	
	

}
