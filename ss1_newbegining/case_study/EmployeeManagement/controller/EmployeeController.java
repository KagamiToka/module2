package case_study.EmployeeManagement.controller;

import case_study.EmployeeManagement.model.entity.Employee;
import case_study.EmployeeManagement.model.service.EmployeeService;
import case_study.EmployeeManagement.model.service.IEmployeeService;

import java.util.List;

public class EmployeeController {
    IEmployeeService employeeService = new EmployeeService();

    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public void updateEmployee(String id, Employee employee) {
        employeeService.updateEmployee(id, employee);
    }

    public void deleteEmployee(String id) {
        employeeService.removeEmployee(id);
    }
}
