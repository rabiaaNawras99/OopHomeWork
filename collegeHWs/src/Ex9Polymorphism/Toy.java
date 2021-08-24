package Ex9Polymorphism;

public abstract class Toy {
	
	protected String name;
	protected double basePrice; 
	
	//c`tor
	
	public Toy(String name,double basePrice) {
		setName(name);
		setBasePrice(basePrice);
		
	}
	//setters and geters:
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public double getBasePrice() {return basePrice;}
	public void setBasePrice(double basePrice) {this.basePrice = basePrice;}
	
	
	
	//toString
	@Override
	public String toString() {
		return getClass().getSimpleName()+
				" [name=" + getName()+
				", basePrice=" + 
				getBasePrice() + "]";}
	
	
	//equals:
	@Override
	public  boolean equals(Object obj) {
		if(obj instanceof Toy) {//if(this.obj.getClass()==obj.getClass()
			Toy toy2= ((Toy)obj);
			return this.name.equals(toy2.name);
		}
		return false;
	}
	
	//computePrice
	public abstract double computePrice() ;
	
	
	//changeBasePrice
	public  void changeBasePrice(double p) {
		if(basePrice<=p&&p<=p) {
			basePrice= basePrice *(1+p);
		}
		
	}
	

}
