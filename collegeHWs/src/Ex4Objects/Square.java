package Ex4Objects;

public class Square {
	 private double x;
	 
	 public Square(double x) {
			 setSquare(x);
		 }
		 	 
		//attributes
		 //setter
	public void setSquare(double length) {
			x=Math.abs(length);
		}
	public double getSquare() {
			return x;
		}	
		
		//methods
	public double getArea() {
			return x*x;
		}
	 public String getObjName() {
				String name="Square";
				return name;

			}
		
	public String toString() {
			String text ="the object is "+getObjName()+" and the length of the limb is "+ x + "and the area is " + getArea();
			System.out.println(text);
			return (text);}
	}



