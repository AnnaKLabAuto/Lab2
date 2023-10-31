import employees.Employee;
import employees.Manager;
import product.Project;
import product.Task;

import java.util.List;

public class ProjectService {

    private Project projects;

    public ProjectService(Project projects) {
        this.projects = projects;
    }

    public void addTaskToProject(Project project, Task task) {
        project.addTask(task);
        System.out.println("Added task to project: " + project.getName());
    }

    public void addEmployeeToProject(Project project, Employee employee) {
        project.addEmployee(employee);
        System.out.println("Added employee to project: " + employee.getFirstName() + " " + employee.getLastName());
    }

    public void displayProjectInfo(Project project) {
        System.out.println("Project Information: " + project);
    }
}