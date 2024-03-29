package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;
public class EmployeDao implements  Idao<Employee> {
    EmployeeRepository employeeRepository=new EmployeeRepository();

    public EmployeDao() {
        super();
    }

    @Override
    public List<Employee> selectAll() {
        return employeeRepository.findAllEmployees();
    }

    @Override
    public Employee select(Long id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public int insert(Employee employee) throws SQLException {
        try {
            employeeRepository.addEmployee(employee);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteEmploye(id);

    }
}
