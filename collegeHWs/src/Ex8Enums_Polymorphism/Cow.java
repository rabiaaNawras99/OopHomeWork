package Ex8Enums_Polymorphism;

public class Cow extends Mammal{
	
	private int givingBirth;
	private CowColor color;
	
	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 * @param calInMilk
	 * @param pregMonth
	 */
	public Cow(String name, int age, boolean isDangerous,
			int caloriesPerMeal, int calInMilk, int pregMonth,
			 int givingBirth, CowColor color) {
		super(name, age, isDangerous, caloriesPerMeal, calInMilk,
				pregMonth);
		this.givingBirth=givingBirth;
		this.color=color;
		
	}
	/**
	 * @return the givingBirth
	 */
	public int getGivingBirth() {
		return givingBirth;
	}
	/**
	 * @param givingBirth the givingBirth to set
	 */
	public void setGivingBirth(int givingBirth) {
		this.givingBirth = givingBirth;
	}
	/**
	 * @return the color
	 */
	public CowColor getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(CowColor color) {
		this.color = color;
	}
	@Override
	public int eat() {
		return super.eat()/4;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"givingBirth=" + givingBirth +
				", color=" + color + "]";
	}
	//equals:
	public boolean equals(Cow cow2) {
		return this.getName().equals(cow2.getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cow) {
			Cow cow2=((Cow)obj);
			return this.getName().equals(cow2.getName());
		}
		return false;
	}
	
	

}
