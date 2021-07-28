package Ex2Loops;
import java.util.Scanner;
public class Ex2Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 3 values for a single numerical sequence please :-> ");
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter n :");
		int n =sc1.nextInt();
		System.out.println("Enter a1:");
		int a1=sc1.nextInt();		
		System.out.println("Enter d:");
		int d=sc1.nextInt();
	int s1=a1;
		/*for (int i=0;i<n;i++) {
		s1=a1+(i*d);
		System.out.print(" "+ s1 + ",");			
		}*/
	
	int i=0;
	while(i<n) {
		s1=a1+(i*d);
		System.out.print(" "+ s1 + ",");
		i++;
	}
	 sc1.close();
	}

	

}
