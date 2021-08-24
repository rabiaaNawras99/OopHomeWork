package Ex8Enums_Polymorphism;

public class Bird extends Animal{
	private int wingTall;
	private int shoulderLength;
	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 * @param tall
	 * @param length
	 */
	public Bird(String name, int age, boolean isDangerous,
			int caloriesPerMeal, int wingTall, int shoulderLength) {
		super(name, age, isDangerous, caloriesPerMeal);
		this.wingTall = wingTall;
		this.shoulderLength = shoulderLength;
	}
	/**
	 * @return the wingTall
	 */
	public int getWingTall() {
		return wingTall;
	}
	/**
	 * @param wingTall the wingTall to set
	 */
	public void setWingTall(int wingTall) {
		this.wingTall = wingTall;
	}
	/**
	 * @return the shoulderLength
	 */
	public int getShoulderLength() {
		return shoulderLength;
	}
	/**
	 * @param shoulderLength the shoulderLength to set
	 */
	public void setShoulderLength(int shoulderLength) {
		this.shoulderLength = shoulderLength;
	}
	
	
	//toString
	@Override
	public String toString() {
		return super.toString()+"wingTall=" + wingTall + ", shoulderLength=" + shoulderLength + "]";
	}
	//sing
	public void sing() {
		System.out.println("lalalalalalaalaalalaaaaaa");
	}
	

		
		
	
	
}