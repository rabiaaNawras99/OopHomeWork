package Ex8Enums;

public class Reptile extends Animal{
	private int tailLength;

	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 * @param tailLength
	 */
	public Reptile(String name, int age, 
			boolean isDangerous, int caloriesPerMeal,
			int tailLength) {
		
		super(name, age, isDangerous, caloriesPerMeal);
		
		this.tailLength = tailLength;
	}

	/**
	 * @return the tailLength
	 */
	public int getTailLength() {
		return tailLength;
	}

	/**
	 * @param tailLength the tailLength to set
	 */
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	
	//tostring
	@Override
	public String toString() {
		return super.toString()+" tailLength=" + 
	tailLength + "]";
	}
	
	
	
	

}
