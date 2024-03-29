package bean;

import dao.EmployeDao;
import jakarta.annotation.ManagedBean;
import jakarta.faces.bean.ViewScoped;
import model.Employee;

import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class EmployeeBean implements Serializable {
    private List<Employee> employees;
    private EmployeDao employeDao;

    public EmployeeBean() {
        employeDao = new EmployeDao();
        employees = employeDao.selectAll();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}