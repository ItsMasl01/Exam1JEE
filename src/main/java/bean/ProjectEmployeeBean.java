package bean;

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

    // Méthode pour récupérer la liste des noms des employés
    public List<String> getEmployeeNames() {
        // Ici, tu devras implémenter la logique pour récupérer les noms des employés depuis ta base de données
        List<String> employeeNames = new ArrayList<>();
        // Ajoute tes employés à la liste employeeNames
        return employeeNames;
    }

    // Méthode pour récupérer la liste des noms des projets
    public List<String> getProjectNames() {
        // Ici, tu devras implémenter la logique pour récupérer les noms des projets depuis ta base de données
        List<String> projectNames = new ArrayList<>();
        // Ajoute tes projets à la liste projectNames
        return projectNames;
    }

    // Méthode pour affecter un projet à un employé avec l'implication spécifiée
    public void assignProject() {
        // Ici, tu devras implémenter la logique pour affecter le projet à l'employé avec l'implication spécifiée
        System.out.println("Employee: " + selectedEmployee);
        System.out.println("Project: " + selectedProject);
        System.out.println("Implication: " + implication);
        // Ajoute ta logique d'affectation du projet à l'employé ici
    }

    // Getters et Setters pour les propriétés
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
