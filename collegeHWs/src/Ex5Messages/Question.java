package Ex5Messages;
import java.util.Scanner;
public class Question {
Scanner scanner = null;
	
	Question(){
		scanner = new Scanner(System.in);
		return;
	}
	
	String ask(String question) {
		System.out.println(question);
		return(scanner.next());

	}
}
