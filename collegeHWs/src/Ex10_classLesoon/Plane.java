package Ex10_classLesoon;

public class Plane implements Movable,Comparable<Plane>{
	private int id;
	private String source;
	private String destination;
	private int maxHeight;
	//c`tor:
	public Plane(int id, String source,
			String destination, int maxHeight) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.maxHeight = maxHeight;
	}
	//setters and getters:
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getSource() {return source;}
	public void setSource(String source) {this.source = source;}
	public String getDestination() {return destination;}
	public void setDestination(String destination) {this.destination = destination;}
	public int getMaxHeight() {	return maxHeight;}
	public void setMaxHeight(int maxHeight) {this.maxHeight = maxHeight;}
	//compareTo
	
	public int compareTo(Plane p2) {
		Integer int1=this.getMaxHeight();
		Integer int2=p2.getMaxHeight();
		return int1.compareTo(int2);
				
//		return this.getMaxHeight()-p2.getMaxHeight();
//		//in condition that both heights are positive..
//		//==->0
//		//this>x->+
//		//this<->-
		
	}	
	
	
	
	
	
	
	
	
	//toString
	@Override
	public String toString() {
		return getClass().getSimpleName()+" [id=" + 
	id + ", source=" + source +
	", destination=" + destination +
	", maxHeight=" + maxHeight + "]";
	}//move
	@Override
	public void move() {
		String tmp =getSource();
		setSource(getDestination());
		setDestination(tmp);
	}//getType
	@Override
	public String getType() {
		return getClass().getSimpleName();
		}
	//details
	@Override
	public String details() {
		return this.toString();
	}
	
	
	
	
	
	

}
