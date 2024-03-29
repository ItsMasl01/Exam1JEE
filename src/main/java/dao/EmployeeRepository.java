package dao;

import jakarta.persistence.*;
import model.Employee;

import java.util.List;

public class EmployeeRepository {
    private EntityManager entityManager;

    public EmployeeRepository() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistentUserGroup");
        this.entityManager = emf.createEntityManager();
    }

    public List<Employee> findAllEmployees() {
        TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
        return query.getResultList();
    }
    public Employee findEmployeeById(Long id) {
        return entityManager.find(Employee.class, id);
    }


    public void addEmployee(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }



    public void deleteEmploye(Long id) {
        entityManager.getTransaction().begin();
        Employee employee=findEmployeeById(id);
        entityManager.remove(employee);
        entityManager.getTransaction().commit();

    }
    public void close() {
        entityManager.close();
    }
}
