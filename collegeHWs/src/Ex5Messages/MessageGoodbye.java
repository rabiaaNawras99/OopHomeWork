package Ex5Messages;

public class MessageGoodbye {
String user_name;
	
	MessageGoodbye(){
		user_name = "someone";
		return;
	}
	
	MessageGoodbye(String name){
		user_name = name;
		System.out.println("Good by " + user_name);

}
}