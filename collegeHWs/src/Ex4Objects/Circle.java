package Ex4Objects;

public class Circle {
	private double radius;
	//Constructor
		public Circle(double rad) {
			setRadius(rad);
		}
		//attributes
		 //setter
		 public void setRadius(double rad) {
			 radius= Math.abs(rad);	
		}
		 //getter
		 public double getRadius() {
			return radius;
		}	
		 public String getObjName() {
				String name="Circle";
				return name;
			}
		public double getArea() {
			return((Math.PI*(radius*radius)));
		}
		
	public String toString() {
		String text="the object is "+getObjName()+" and the radius is "+getRadius()+" and; the area is "+ getArea() ;
		System.out.println(text);
		return text;}
	

}
