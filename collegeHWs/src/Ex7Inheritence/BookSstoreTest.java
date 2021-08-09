package Ex7Inheritence;



public class BookSstoreTest {

	public static void main(String[] args) {
		
		
		
		EducationalBook eduBook1 = new EducationalBook("Title1","author1",150,true);
		EducationalBook eduBook2 = new EducationalBook("Title2","author2",250,true);
		EducationalBook eduBook3 = new EducationalBook("Title3","author3",350,false);
		EducationalBook eduBook4 = new EducationalBook("Title4","author4",650,true);
		
		CookBook cBook = new CookBook("TitleCook", "AuthorChef", 700, "ramadan");
		CookBook cBook1 = new CookBook("TitleCook1", "AuthorChef1", 10, "ramadan kareem");
		
		BookStore store = new BookStore("Emek Yezrael");
		
		store.addCookBook(cBook1);
		store.addCookBook(cBook);
		store.addEduBook(eduBook1);
		store.addEduBook(eduBook2);
		store.addEduBook(eduBook3);
		store.addEduBook(eduBook4);
		
		
	store.printAll();
		
		
	}

}
