package Ex8Enums_Polymorphism;

public class Hipo extends Mammal{
	private double fat;
	
	//c`tor;
		/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 * @param calInMilk
	 * @param pregMonth
	 * @param fat
	 */
		public Hipo(String name, int age, boolean isDangerous, 
				int caloriesPerMeal, int calInMilk,
				int pregMonth, double fat) {
			super(name, age, isDangerous, caloriesPerMeal,
					calInMilk, pregMonth);
			setFat(fat);
		}

		//setters and getters
		/**
		 * @return the fat
		 */
		public double getFat() {
			return fat;
		}

		/**
		 * @param fat the fat to set
		 */
		public void setFat(double fat) {
			if(fat>=0&&fat<=1) {
			  this.fat = fat;
			}
		} 
		//toString()

		@Override
		public String toString() {
			return super.toString()+"fat=" + fat + "]";
		}
		
		

	}
