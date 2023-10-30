package managment.model;
import java.util.ArrayList;
import java.util.Objects;

public class Manager {

    private String firstName;
    private String lastName;
    private String department;
    private String title;
    private ArrayList<Employee> employeeList;

    public Manager(String firstName, String lastName, String department, String title, ArrayList<Employee> employeeList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.title = title;
        this.employeeList = employeeList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(firstName, manager.firstName) && Objects.equals(lastName, manager.lastName) && Objects.equals(department, manager.department) && Objects.equals(title, manager.title) && Objects.equals(employeeList, manager.employeeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, department, title, employeeList);
    }
}
