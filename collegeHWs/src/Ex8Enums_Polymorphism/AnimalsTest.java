package Ex8Enums_Polymorphism;
import java.util.ArrayList;


public class AnimalsTest {

	public static int getAllValories(ArrayList<Animal> arr) {
		int counter=0;
		for (Animal animal : arr) {
			counter+=animal.eat();
		}
		return counter;
	}
	//func2
public static String getFatestHipo(ArrayList<Animal> aar) {
	double maxFat=0;
	Hipo maxHipo=null;
	for (Animal animal : aar) {
		if(animal instanceof Hipo) {
			Hipo curr_hipo =((Hipo)animal);
			if(curr_hipo.getFat()> maxFat) {
				maxFat =curr_hipo.getFat();
				maxHipo=curr_hipo;
			}
		
		}
	}
	if(maxHipo!=null) {
		return maxHipo.getName();
	}
	return null;
	
}
//func3
public static void letThemSing(ArrayList<Animal> aar) {
	for (Animal animal : aar) {
		if(animal instanceof Bird) {
			((Bird)animal).sing();
		}
	}
}
		


		
	public static void main(String[] args) {
		
		
		Animal animal1 =new Animal("semba", 5, true, 5000);
		System.out.println(animal1);
		
		Mammal mammal=new Mammal("semba", 5, true, 5000,500,12);
		System.out.println(mammal);
		
		//polymorphism:
		
		Animal animal2 =new Cow("semba", 5, true, 5000,100,8,2,CowColor.BLACK);
		
		Animal animal3 =new Animal("semba", 5, true, 5000);
		
		System.out.println(animal1.eat());
		System.out.println(animal2.eat());
		System.out.println(animal3.eat());
		System.out.println("******************************");
		

		//polymorphism:
		
		ArrayList<Animal> animals=new ArrayList<Animal>();
		animals.add(animal2);
		animals.add(animal1);
		animals.add(animal3);
		int allCall =getAllValories(animals);
		System.out.println("over all calories: "+ allCall);
		


		

	}

}

	
	
	


