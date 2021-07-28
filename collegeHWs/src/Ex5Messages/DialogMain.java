package Ex5Messages;

public class DialogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Message message = new Message();
				//message.printMessage("What is your name ?");
				
				Question q_name = new Question();
				String user_name = q_name.ask("What is your name ?");
				
				MessageGoodbye message_good_by = new MessageGoodbye(user_name);	
				System.out.println(message_good_by);
				return;
	}

	}


