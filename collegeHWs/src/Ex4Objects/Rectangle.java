package Ex4Objects;

public class Rectangle {
	private double width;
	 private double length;

public Rectangle(double width,double length) {
		setLength(length);
		setWidth(width);
	}
	 //setter
public void setLength(double len) {
	length = Math.abs(len);
}	
public void setWidth(double w) {
	width= Math.abs(w);
}
  //getter
public double getLength() {
	return length;
}
public double getWidth() {
	return width;
}
	
public double getArea() {
		return length*width;
	}
public String getObjName() {
	String name="Rectangle";
	return name;
}
	
public String toString() {
String text="the object is "+ getObjName() +" and the length of the first limb is "+ length +" and the length of the second limb is "+ width + " and the area is "+ getArea();
System.out.println(text);
	return text ;}

}
