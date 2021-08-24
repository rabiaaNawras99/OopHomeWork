package Ex9Polymorphism;

public class Dolly extends Toy{
	private int accessories;
	private double accPrice;
	
	//c`or:
	public Dolly (String name, double basePrice,
			int accessories, double accPrice) {
		super(name,basePrice);
		setAccessories(accessories);
		setAccPrice(accPrice);
		}
	//setters and getters
	public int getAccessories() {return accessories;}
	public void setAccessories(int accessories) {this.accessories = accessories;}
	public double getAccPrice() {return accPrice;}
	public void setAccPrice(double accPrice) {this.accPrice = accPrice;}
	
	//computePrice-abstract method:
	@Override
	public  double computePrice() {
		return getBasePrice() +
				(this.getAccessories()*this.getAccPrice());
	}
	
	
	
	
	
}