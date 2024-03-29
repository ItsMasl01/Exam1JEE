package model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@NamedQuery(name = "findEmployee",query = "select e from Employee e where e.id=:id")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private List<String> skills;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project_percentage",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects;


    public Employee(Long id, String name, String email, List<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }


    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
