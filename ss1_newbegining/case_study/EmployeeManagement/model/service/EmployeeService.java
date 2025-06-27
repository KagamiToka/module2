package case_study.EmployeeManagement.model.service;

import bai_tap_lam_them.model.service.ICarService;
import case_study.EmployeeManagement.model.entity.Employee;
import case_study.EmployeeManagement.model.repository.EmployeeRepository;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employeeRepository.addEmployee(employee)) {
            System.out.println("Add Employee Success");
        } else  {
            System.out.println("Add Employee Failed");
        }
    }

    @Override
    public void removeEmployee(String id) {
        if (employeeRepository.deleteEmployee(id)) {
            System.out.println("Remove Employee Success");
        } else   {
            System.out.println("Remove Employee Failed");
        }
    }

    @Override
    public void updateEmployee(String id, Employee employee) {
        if (employeeRepository.updateEmployee(id, employee)) {
            System.out.println("Update Employee Success");
        } else   {
            System.out.println("Update Employee Failed");
        }
    }
}
