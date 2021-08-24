package Ex8Enums_Polymorphism;
import java.util.ArrayList;

public class Park {

	private ArrayList<Animal> animals;
	
	private static int counter=0;
	
   public Park() {
	animals =new ArrayList<>();
	counter++;
	
}

/**
 * @return the animals
 */
public ArrayList<Animal> getAnimals() {
	return animals;
}




/**
 * @param animals the animals to set
 */
public void setAnimals(ArrayList<Animal> animals) {
	this.animals = animals;
}




/**
 * @return the counter
 */
public static int getCounter() {
	return counter;
}




/**
 * @param counter the counter to set
 */
public static void setCounter(int counter) {
	Park.counter = counter;
}






	//addAnimal


public void addAnimal(Animal hia) {
	if(!animals.contains(hia)) {
	animals.add(hia);
	counter++;
	}
}
//up10:
public ArrayList<Animal> findDangerOld(){
	ArrayList<Animal> res = new ArrayList<Animal>();
	
	for (Animal animal : animals) {
		if(animal.isDangerous() && animal.getAge() >= 10) {
			res.add(animal);
		}
	}
	
	return res;
}
}








