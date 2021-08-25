package Ex10_comparEmployee;

import java.util.Comparator;

import javax.print.attribute.standard.PrintQuality;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	public int compare(Employee emp1,Employee emp2) {
		Double int1=emp1.getAverageSalary();
		Double int2=emp2.getAverageSalary();
		return int1.compareTo(int2);
		}
}
