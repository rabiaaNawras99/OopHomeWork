package Ex8Enums_Polymorphism;

public class Snake extends Reptile{
	
	private boolean isToxic;
	private SnakeColor color;
	/**
	 * @param name
	 * @param age
	 * @param isDangerous
	 * @param caloriesPerMeal
	 * @param tailLength
	 * @param isToxic
	 * @param color
	 */
	public Snake(String name, int age, boolean isDangerous,
			int caloriesPerMeal, int tailLength, boolean isToxic,
			SnakeColor color) {
		super(name, age, isDangerous, caloriesPerMeal, tailLength);
		this.isToxic = isToxic;
		this.color = color;
	}
	/**
	 * @return the isToxic
	 */
	public boolean isToxic() {
		return isToxic;
	}
	/**
	 * @param isToxic the isToxic to set
	 */
	public void setToxic(boolean isToxic) {
		this.isToxic = isToxic;
	}
	/**
	 * @return the color
	 */
	public SnakeColor getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(SnakeColor color) {
		this.color = color;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"isToxic=" + isToxic + ", color=" + color + "]";
	}
	
	
	
	

}
