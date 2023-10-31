import company.Department;
import employees.Employee;
import employees.Manager;
import product.Project;
import product.Task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Department it_department = new Department("IT", "Information Technology Department");

        Employee employee1 = new Employee("Franziska" , "Waltraud", it_department, "Developer");
        Employee employee2 = new Employee("Hubertus", "Andrea", it_department, "Software Engineer");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        Manager manager1 = new Manager("Tomas", "Andrea", it_department, "Team Leader", employeeList);

        Task task1 = new Task("Add button", "Adding button to interface");
        Task task2 = new Task("Add button2", "Adding button2 to interface");

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);

        Project project = new Project("TicketApp", "App for buying tickets.", tasks, employeeList);

        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployee(employee1);
        employeeService.displayEmployeeInfo();

        ProjectService projectService = new ProjectService(project);
        projectService.addTaskToProject(project, task1);
        projectService.addEmployeeToProject(project, employee1);
        projectService.displayProjectInfo(project);

    }
}