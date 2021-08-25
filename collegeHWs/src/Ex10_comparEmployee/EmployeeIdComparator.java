package Ex10_comparEmployee;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{
	public int compare(Employee emp1,Employee emp2) {
		Integer int1=emp1.getId();
		Integer int2=emp2.getId();
		return int1.compareTo(int2);
		
	}

}
