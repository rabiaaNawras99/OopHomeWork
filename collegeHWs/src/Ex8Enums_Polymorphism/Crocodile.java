package Ex8Enums_Polymorphism;

public class Crocodile extends Reptile{
	private boolean isDentalCare;

	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 * @param tailLength
	 * @param isDentalCare
	 */
	public Crocodile(String name, int age, 
			boolean isDangerous, int caloriesPerMeal,
			int tailLength,boolean isDentalCare) {
		super(name, age, isDangerous, caloriesPerMeal,
				tailLength);
		
		this.isDentalCare = isDentalCare;
	}

	/**
	 * @return the isDentalCare
	 */
	public boolean isDentalCare() {
		return isDentalCare;
	}

	/**
	 * @param isDentalCare the isDentalCare to set
	 */
	public void setDentalCare(boolean isDentalCare) {
		this.isDentalCare = isDentalCare;
	}


	
	//toString
	@Override
	public String toString() {
		return super.toString()+"isDentalCare=" + 
	isDentalCare + "]";
	}
	
	
	
	

}
