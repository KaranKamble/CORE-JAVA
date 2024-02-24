package test;

import java.util.Comparator;

public class SortByJob implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getJob().compareTo(emp2.getJob());
	}
}
