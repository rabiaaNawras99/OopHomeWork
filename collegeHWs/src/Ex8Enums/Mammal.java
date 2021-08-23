package Ex8Enums;

public class Mammal extends Animal{
	protected int calInMilk;
	protected int pregMonth;
	//c`tor:
	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 */
	
	public Mammal(String name, int age, boolean isDangerous,
			int caloriesPerMeal,int calInMilk, int pregMonth) {
		
		super(name, age, isDangerous, caloriesPerMeal);
		this.calInMilk=calInMilk;
		this.pregMonth=pregMonth;
		
	}
	//setters ang getters;
	/**
	 * @return the calInMilk
	 */
	public int getCalInMilk() {
		return calInMilk;
	}
	/**
	 * @param calInMilk the calInMilk to set
	 */
	public void setCalInMilk(int calInMilk) {
		this.calInMilk = calInMilk;
	}
	/**
	 * @return the pregMonth
	 */
	public int getPregMonth() {
		return pregMonth;
	}
	/**
	 * @param pregMonth the pregMonth to set
	 */
	public void setPregMonth(int pregMonth) {
		this.pregMonth = pregMonth;
	}
	//toString()
	@Override
	public String toString() {
		return super.toString()+" calInMilk=" + calInMilk +
				", pregMonth=" + pregMonth + "]";
	}
	@Override
	//eat()
	public int eat() {
		return super.eat()+calInMilk;
	}
	
	
	
	
	
	
	
	
	

}
