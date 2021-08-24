package Ex9_2Channels;

import java.util.Date;

public class ChildernChannel extends Channel{
	private String type;
	private String website;
	//c`tor:
	public ChildernChannel(String name,
			Method method, String location,
			Date onLineDate, String type, 
			String website) {
		
		super(name, method, location, onLineDate);
		
		this.type = type;
		this.website = website;
	}
	//setters and geters
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public String getWebsite() {return website;}
	public void setWebsite(String website) {this.website = website;}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+" [type=" + type + ", website=" + website + "]";
	}
	
	
	
	

}
