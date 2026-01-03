package application;
import java.util.ArrayList;
import java.util.List;


public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    
    public boolean employeeExists(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
    
    public Employee findById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

 // Returns a list of employees with the given name
    public List<Employee> findAllByName(String name) {
        List<Employee> matches = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                matches.add(emp);
            }
        }
        return matches;
    }

}
