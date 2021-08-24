package Ex9_2Channels;

import java.util.Date;

public class Channel {
	protected String name;
	protected Method method;
	protected String location;
	protected Date onLineDate;
	
	//c`tor:
	public Channel(String name, Method method,
			String location, Date onLineDate) {
		this.name = name;
		this.method = method;
		this.location = location;
		this.onLineDate = onLineDate;
	}
	
	//setters and getters:
	public String getName() {return name;}
    public void setName(String name) {this.name = name;}
	public Method getMethod() {return method;}
	public void setMethod(Method method) {this.method = method;}
	public String getLocation() {return location;}
	public void setLocation(String location) {this.location = location;}
	public Date getOnLineDate() {return onLineDate;}
	public void setOnLineDate(Date onLineDate) {this.onLineDate = onLineDate;}
	
	//toString
	@Override
	public String toString() {
		return getClass().getSimpleName() +"[name=" + name + 
				", method=" + method +
				", location=" + location +
				", onLineDate=" + onLineDate
				+ "]";
	}
    //equals:
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Channel) {
			Channel ch2=((Channel)obj);
			return this.name.equals(ch2.name);
		}
		return false;
	}

	
	
	
	
}