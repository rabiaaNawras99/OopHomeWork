package Ex10_comparEmployee;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{
		private String name;
		private int id;
		private ArrayList<Integer> salaries;
		//c`tor
		public Employee(String name, int id){
		this.name=name;
		this.id=id;
		salaries = new ArrayList<Integer>();
		}
		//setters and getters:
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		public int getId() {return id;}
		public void setId(int id) {this.id = id;}
		public ArrayList<Integer> getSalaries() {return salaries;}
		public void setSalaries(ArrayList<Integer> salaries) {this.salaries = salaries;}
		//addSalary
		public void addSalary(int salary){
		 salaries.add(salary);
		}
		//toString
		public String toString() {
			return "Employee [name=" + name + 
					", id=" + id + ", salaries=" +
					salaries + "]";
		}
		//avg salary
		public double getAverageSalary() {
			int sum=0;
			for (Integer integer : salaries) {
			sum+=integer;
			}
			return sum/salaries.size();
		}
		//comparable
		@Override
		public int compareTo(Employee o) {
			Integer int1=this.id;
			Integer int2=o.id;
			
			return int1.compareTo(int2);
		}
		

		
		
	

		
}
