package Ex7Inheritence;

public class EducationalBook extends Book {
	private boolean isVegetarian;
	
	//c`tor:
	public EducationalBook(String title, String author, double price,boolean isVegetarian) {
		super(title,author,price);
		setVegetarian(isVegetarian);;
	}
//setters and getters:
	public boolean isVegetarian() {
		return isVegetarian;
	}

	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	//to string function
	public String toString () {
		return super.toString()+"the book :"+isVegetarian;
	}
	
	
	
	

}
