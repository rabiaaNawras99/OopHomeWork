package Ex9Polymorphism;

public class TeddyBear extends Toy{
	private boolean isBig;
	private String color;
	
	//c`tor;
	public TeddyBear (String name , double basePrice,
			String color, boolean isBig){
		super(name,basePrice);
		setBig(isBig);
		setColor(color);
	}
	
	//stters and getters;
	public boolean isBig() {return isBig;}
	public void setBig(boolean isBig) {this.isBig = isBig;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+"[isBig=" + isBig +
				", color=" + color + "]";
	}
	//computePrice
	public  double computePrice() {
		if(isBig) {
			return getBasePrice()+30;
		}
		return getBasePrice()+15;
	}
	
	
}
