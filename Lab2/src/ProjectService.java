import product.Task;

import java.util.List;

public class ProjectService {

    public void createProject(String name, String description, List<Task> tasks) {
        System.out.println("Create project");
    }
    public void editProject(String name, String description) {
        System.out.println("Edit project");
    }
    public void deleteProject() {
        System.out.println("Remove project");
    }

}