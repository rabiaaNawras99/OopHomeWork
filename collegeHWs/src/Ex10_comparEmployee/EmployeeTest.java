package Ex10_comparEmployee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class EmployeeTest {
	
	//comperator FindMin
	static Employee findMin(ArrayList<Employee> arr,Comparator<Employee> comp) {
	     Employee minEmp=Collections.min(arr, comp);
	     return minEmp;
	}//comapabale FindMin
	static Employee findMin1(ArrayList<Employee> arr) {
	     Employee minEmp=Collections.min(arr);
	     return minEmp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> lst=new ArrayList<Employee>();
		lst.add(new Employee("name1", 1));
		lst.add(new Employee("name2", 2));
		lst.add(new Employee("name3", 3));
		lst.add(new Employee("name4", 4));

		Random rand =new Random();
		for (Employee emp : lst) {
			emp.addSalary(500+rand.nextInt(1000));
			
		}
		
		EmployeeSalaryComparator comp=new EmployeeSalaryComparator();
		
		Employee min =findMin(lst, comp);
		EmployeeIdComparator comp2=new EmployeeIdComparator();
		Employee idemp=findMin(lst, comp2);
				
		System.out.println(min);
		System.out.println("******************");
		System.out.println(idemp);
		
		
		
	}

}
