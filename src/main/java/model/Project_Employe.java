package model;

import jakarta.persistence.*;

public class Project_Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Project project;

    private double percentage;
}
