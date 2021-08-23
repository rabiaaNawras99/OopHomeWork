package Ex8Enums;

public class Animal {
	protected String name;
	protected int age;
	protected boolean isDangerous;
	protected int caloriesPerMeal;
	//c`tor:
	//public Animal() {}
	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 */
	public Animal(String name, int age, boolean isDangerous,
			int caloriesPerMeal) {
		
		super();
		this.name = name;
		this.age = age;
		this.isDangerous = isDangerous;
		this.caloriesPerMeal = caloriesPerMeal;
	}
	//setters and getters:
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the isDangerous
	 */
	public boolean isDangerous() {
		return isDangerous;
	}
	/**
	 * @param isDangerous the isDangerous to set
	 */
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	/**
	 * @return the caloriesPerMeal
	 */
	public int getCaloriesPerMeal() {
		return caloriesPerMeal;
	}
	/**
	 * @param caloriesPerMeal the caloriesPerMeal to set
	 */
	public void setCaloriesPerMeal(int caloriesPerMeal) {
		this.caloriesPerMeal = caloriesPerMeal;
	}
	
	
	//toString()
	@Override
	public String toString() {
		return "\n"+ getClass().getSimpleName()+"[name=" + 
	name + ", age=" + age + ", isDangerous=" + isDangerous +
	", caloriesPerMeal="
				+ caloriesPerMeal + "]";
	}
	//eat()
	public int eat() {
		return caloriesPerMeal*3;
	}
	
	
	
	
	

}
