import employees.Employee;

import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employeeList;
    public EmployeeService() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        System.out.println("Add employee");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Remove employee");
    }

    public void displayEmployeeInfo() {
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getFirstName());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("Title: " + employee.getTitle());
            System.out.println("In department: " + employee.getDepartment());
            System.out.println();
        }
    }
}
