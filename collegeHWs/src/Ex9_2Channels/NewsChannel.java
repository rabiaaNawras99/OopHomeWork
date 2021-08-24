package Ex9_2Channels;

import java.util.Date;

public class NewsChannel extends Channel implements Ratanable{
	private int numOfZones;
	private int numOfReporters;
	//c`tor;
	
	public NewsChannel(String name, Method method, 
			String location, Date onLineDate, 
			int numOfZones,int numOfReporters) {
		
		super(name, method, location, onLineDate);
		
		this.numOfZones = numOfZones;
		this.numOfReporters = numOfReporters;
	}
	//setters and getters
	public int getNumOfZones() {return numOfZones;}
	public void setNumOfZones(int numOfZones) {	this.numOfZones = numOfZones;}
	public int getNumOfReporters() {return numOfReporters;}
	public void setNumOfReporters(int numOfReporters) {this.numOfReporters = numOfReporters;}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+" [numOfZones=" + numOfZones + ", numOfReporters=" + numOfReporters + "]";
	}
	//
	public int rating() {
		return numOfReporters/numOfZones;
	}
	

}
