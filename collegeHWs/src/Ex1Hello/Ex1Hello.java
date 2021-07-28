package Ex1Hello;


import java.util.Scanner;

public class Ex1Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask for the usre name
				System.out.println("Enter your name please : ");
				Scanner sc =new Scanner(System.in);
				String str = sc.nextLine();
				//hello messege to the user
				System.out.println("hi "+ str + " nice to meet you!");
				sc.close();

	}

}
