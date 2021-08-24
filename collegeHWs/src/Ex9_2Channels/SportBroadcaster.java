package Ex9_2Channels;

public class SportBroadcaster implements Ratanable{
	private String name;
	private int numOfGames;
	private int numOfChannels;
	//c`tor:
	public SportBroadcaster(String name, int numOfGames, int numOfChannels) {
		this.name = name;
		this.numOfGames = numOfGames;
		this.numOfChannels = numOfChannels;
	}
	//setters and getters:
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getNumOfGames() {return numOfGames;}
	public void setNumOfGames(int numOfGames) {this.numOfGames = numOfGames;}
	public int getNumOfChannels() {return numOfChannels;}
	public void setNumOfChannels(int numOfChannels) {this.numOfChannels = numOfChannels;}
	
	//toString
	@Override
	public String toString() {
		return getClass().getSimpleName() + "\nname: " + name + "\nnumOfGames: " + numOfGames + "\nnumOfChannels: "
				+ numOfChannels;}
	//equals
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SportBroadcaster) {
			SportBroadcaster sb = (SportBroadcaster) obj;
			return this.name==sb.name;
		}
		return false;
	}
	
	public int rating() {
		return numOfGames*numOfChannels;
		
	}

}
