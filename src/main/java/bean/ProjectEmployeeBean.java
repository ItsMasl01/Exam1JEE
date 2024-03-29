import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ProjectEmployeeBean implements Serializable {
    private String selectedEmployee;
    private String selectedProject;
    private String implication;

    public List<String> getEmployeeNames() {
        List<String> employeeNames = new ArrayList<>();
        return employeeNames;
    }

    public List<String> getProjectNames() {
        List<String> projectNames = new ArrayList<>();
        return projectNames;
    }

    public void assignProject() {
    }

    public String getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(String selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public String getSelectedProject() {
        return selectedProject;
    }

    public void setSelectedProject(String selectedProject) {
        this.selectedProject = selectedProject;
    }

    public String getImplication() {
        return implication;
    }

    public void setImplication(String implication) {
        this.implication = implication;
    }
}
