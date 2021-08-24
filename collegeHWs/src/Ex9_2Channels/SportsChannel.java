package Ex9_2Channels;

import java.util.Date;

public class SportsChannel extends Channel implements Ratanable{
	 
	private int numOfBroadcasters;
	private int numOfGames;
	//c`tor:
	public SportsChannel(String name, Method method,
			String location, Date onLineDate,
			int numOfBroadcasters,int numOfGames) {
		
		super(name, method, location, onLineDate);
		
		this.numOfBroadcasters = numOfBroadcasters;
		this.numOfGames = numOfGames;
	}
	//seters and getters:
	public int getNumOfBroadcasters() {return numOfBroadcasters;}
	public void setNumOfBroadcasters(int numOfBroadcasters) {this.numOfBroadcasters = numOfBroadcasters;	}
	public int getNumOfGames() {return numOfGames;}
	public void setNumOfGames(int numOfGames) {this.numOfGames = numOfGames;}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+" [numOfBroadcasters=" + numOfBroadcasters + ", numOfGames=" + numOfGames + "]";
	}
	//
	public int rating() {
		return numOfBroadcasters/numOfGames;
	}
	
	
	
	

	

}
