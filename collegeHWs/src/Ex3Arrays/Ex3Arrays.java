package Ex3Arrays;

import java.util.Scanner;

public class Ex3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the user input
				System.out.println("Enter a string of numbers please : ");
				Scanner in =new Scanner(System.in);
				String some_string = in.nextLine();		
				in.close();
				
				//split the string to numbers
				String[] string_arr = some_string.split(",");
				
				//create array of numbers
				int[] array = new int[string_arr.length];
				for(int i=0;i<string_arr.length;i++) {
				array[i]=Integer.parseInt(string_arr[i]);
				System.out.println(" "+ array[i]);
				}
				
				//calculate sum of array
				int sum=0;
				for(int num : array) {
					sum=sum+num;
				}
				System.out.println("The series sum is :"+ sum);
				return;


	}

}
