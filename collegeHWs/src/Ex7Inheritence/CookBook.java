package Ex7Inheritence;

public class CookBook extends Book{
	
	private String subject;
	//c`tor
	public CookBook(String title, String author, double price,String subject) {
		super(title,author,price);
		setSubject(subject);
		
		
	}
//setters and getters 
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//to string function
	public String toString() {
		return super.toString()+"subject= "+getSubject();
		
	}

	
	
	
}
