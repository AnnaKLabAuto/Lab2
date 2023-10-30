import nonamecompany.model.projects.Project;
import nonamecompany.model.projects.Task;
import managment.model.Employee;
import managment.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Franziska" , "Waltraud", "IT", "Developer");
        Employee employee2 = new Employee("Hubertus", "Andrea","IT", "Software Engineer");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        Manager manager1 = new Manager("Tomas", "Andrea","IT", "Team Leader", new ArrayList<>(employeeList));

        Task task1 = new Task("Add button", "Adding button to interface");
        Task task2 = new Task("Add button2", "Adding button2 to interface");

        List<Task> tasks = new ArrayList<>();
        tasks .add(task1);
        tasks .add(task2);

        Project project = new Project("TicketApp", "App for buying tickets.", new ArrayList<>(tasks));

        System.out.println(project);
        System.out.println(manager1);

    }
}