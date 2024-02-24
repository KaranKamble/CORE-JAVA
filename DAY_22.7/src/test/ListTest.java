package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.List;

public class ListTest {
	private List<Employee> list;

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public void addRecord(Employee[] employees) {
		if (this.list != null && employees != null) {
			for (Employee employee : employees)
				this.list.add(employee);
		}
	}

/*	public Employee findRecord(int empid) {
		if (this.list != null) {
			for (Employee emp : this.list) {
				if (emp.getEmpId() == empid)
					return emp;
			}
		}
		return null;
	}
*/
	
	public Employee findRecord(int  empid) {
		if (this.list != null) {
			Employee key = new Employee();
			key.setEmpId(empid);
			if(this.list.contains(key)) {
				int index = this.list.indexOf(key);
				return this.list.get(index);
			}
		}
		return null;
	}
	
	
/*	public boolean removeRecord(int empid) {
		if (this.list != null) {
			Employee key = new Employee();
			key.setEmpId(empid);
			if(this.list.contains(key)) {
				int index = this.list.indexOf(key);
				this.list.remove(index);
				return true;
			}
		}
		return false;
	}
*/
	
	public boolean removeRecord(int empid) {
		if (this.list != null) {
			Employee key = new Employee();
			key.setEmpId(empid);
			if(this.list.contains(key)) {
				this.list.remove(key);
				return true;
			}
		}
		return false;
	}
	
	
	public void printRecord(Comparator<Employee> comparator) {
		if (this.list != null) {
			// Collections.sort(this.list,comparator);
			this.list.sort(comparator);
			for (Employee emp : list)
				System.out.println(emp.toString());
		}
	}

	public void saveRecords(String pathName)throws Exception {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File( pathName))))){
			outputStream.writeObject(this.list);
		}	
	}

	@SuppressWarnings("unchecked")
	public void loadRecords(String pathName)throws Exception {
		try(ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathName))))){
			this.list = (List<Employee>) inputStream.readObject();
		}
		
	}

	

}
