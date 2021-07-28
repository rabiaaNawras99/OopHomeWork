package Ex4Objects;
import java.util.ArrayList;
public class Ex4Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangle rect = new Rectangle(42,87);
		Circle circ = new Circle(4.00);
		Square squr = new Square(4);
		
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("tha object name is "+rect.getObjName()+" \n");
		list1.add("the length of the "+rect.getObjName()+" is " +rect.getLength()  + "\n");
		list1.add("the width of the "+rect.getObjName()+" is "+ rect.getWidth()+ " \n"); 
		list1.add("the Area of the "+rect.getObjName()+" is "+ rect.getArea()+"\n \n");
		
		for(int i = 0; i < list1.size(); i++) 
		{
		    System.out.print(list1.get(i));
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("tha object name is "+circ.getObjName()+" \n");
		list2.add("the length of the "+circ.getObjName()+" is " +circ.getRadius()  + "\n");
		list2.add("the Area of the "+circ.getObjName()+" is "+ circ.getArea()+"\n \n");
		
		for(int i = 0; i < list2.size(); i++) 
		{
		    System.out.print(list2.get(i));
		}
		
		ArrayList<String>
		list3 = new ArrayList<>();
		list3.add("tha object name is "+squr.getObjName()+" \n");
		list3.add("the length of the "+squr.getObjName()+" is " +squr.getSquare()  + "\n");	
		list3.add("the Area of the "+squr.getObjName()+" is "+ squr.getArea()+"\n \n");
		
		for(int i = 0; i < list3.size(); i++) 
		{
		    System.out.print(list3.get(i));
		}
		
		list1.clear();
		list2.clear();
		list3.clear();

		return;

	}

}
