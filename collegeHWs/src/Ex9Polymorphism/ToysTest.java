package Ex9Polymorphism;

import java.util.ArrayList;

public class ToysTest {
	
	public static void main(String[] args) {
		
		Toy toy1=new Dolly("d1", 20, 4, 5);
		Toy toy2=new TeddyBear("t1", 0, "", true);
		Toy toy3=new TeddyBear("t1", 0, "", true);
		Toy toy4=new Dolly("t1", 0, 7,4);
		Toy toy5=new Dolly("t1", 0, 2,3);
		
		
		//1.
		ArrayList<Toy> arr=new ArrayList<>();
		arr.add(toy1);
		arr.add(toy2);
		arr.add(toy3);
		arr.add(toy4);
		arr.add(toy5);
		
		//2.
		for (Toy toy : arr) {
			if(toy instanceof Dolly) {
				Dolly dolly=((Dolly)toy);
				dolly.changeBasePrice(0.2);
			}
		}
		//3.
		for (Toy toy : arr) {
			System.out.println(toy.toString());
			System.out.println("________________");
		}
		
		
	}

}
