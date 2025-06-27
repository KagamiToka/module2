package case_study.EmployeeManagement.model.service;

import case_study.EmployeeManagement.model.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees();
    void addEmployee(Employee employee);
    void removeEmployee(String id);
    void updateEmployee(String id, Employee employee);
}
