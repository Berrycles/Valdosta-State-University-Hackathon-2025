package application;

import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;


public class Employee {
	//required properties
	private int id;
	private String name;
	private String address;
	private BigDecimal salary;
	
	//optional properties
	private String dateOfHire;
	private String dateOfBirth;
	private String department;
	private String role;
	
	private Queue<String> tasks; // Use a queue for tasks
	//private List<String> completedTasks;
	
	
	public Employee(int id, String name, String address, BigDecimal salary, String dateOfHire, String dateOfBirth, String department, String role) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dateOfHire = dateOfHire;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.role = role;
}
	
	
	public void setId(int id) {
		this.id = id;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public void setSalary(BigDecimal salary) {
		this.salary =salary;
		
	}
	
	//required setters
	
	public int getId() {
		return this.id;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	public String getAddress() {
		return this.address;
		
	}
	public BigDecimal getSalary() {
		return this.salary;
		
	}
	//required getters
	
	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
		
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		
	}
	public void setDepartment(String department) {
		this.department = department;
		
	}
	public void setRole(String role) {
		this.role = role;
		
	}
	
	//optional setters
	
	public String getDateOfHire(String dateOfHire) {
		return this.dateOfHire;
		
	}
	
	public String getDateOfBirth(String dateOfBirth) {
		return this.dateOfBirth;
		
	}
	public String getDepartment(String department) {
		return this.department;
		
	}
	public String getRole(String role) {
		return this.role;
		
	}
	//optional getters
	
	 public void addTask(String task) {
	        if (tasks == null) {
	            tasks = new LinkedList<>();
	        }
	        tasks.add(task);
	    }

	 public Queue<String> getTasks() {
		    if (tasks == null) {
		        tasks = new LinkedList<>();
		    }
		    return tasks;  // Return the actual queue, not a copy
		}
    
	
	@Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: "+ address +", Salary: " + salary +"Date Of Hire: "+ dateOfHire +" Date Of Birth: " +dateOfHire + "Department: "+ department+ "Role: " + role ;
    }

}
