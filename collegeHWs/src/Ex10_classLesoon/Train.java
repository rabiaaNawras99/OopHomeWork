package Ex10_classLesoon;

public class Train implements Movable ,Comparable<Train>{
	private int id; 
	private String source; 
	private String destination; 
	private int maxTravelers;
	//c`tor;
	public Train(int id, String source, 
			String destination, int maxTravelers) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.maxTravelers = maxTravelers;
	} 
	//setters and getters;
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getSource() {return source;}
	public void setSource(String source) {this.source = source;}
	public String getDestination() {return destination;}
	public void setDestination(String destination) {this.destination = destination;}
	public int getMaxTravelers() {return maxTravelers;}
	public void setMaxTravelers(int maxTravelers) {this.maxTravelers = maxTravelers;}
	//compareTo
	@Override
	public int compareTo(Train o) {
		Integer int1=this.getMaxTravelers();
		Integer int2=o.getMaxTravelers();
		return int1.compareTo(int2);
	}
	//details
	@Override
	public String details() {
		return this.toString();
	}
	//move
	@Override
	public void move() {
		//normal swapping 
		String tmp =getSource();
		setSource(getDestination());
		setDestination(tmp);
	}
	//toStringgcx
	@Override
	public String toString() {
		return "Train [id=" + id + 
				", source=" + source +
				", destination=" + destination + 
				", maxTravelers="
				+ maxTravelers + "]";
	}//getType
	@Override
	public String getType() {
		return getClass().getSimpleName();
	}
	
	


	
	
	
	
	
	
	
}
