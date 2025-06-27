package case_study.EmployeeManagement.model.repository;

import case_study.EmployeeManagement.model.entity.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();
    private static final String EMPLOYEE_FILE_PATH = "case_study/EmployeeManagement/data/employee.csv";

    public EmployeeRepository() {
        readFile();
    }

    private void readFile() {
        File file = new File(EMPLOYEE_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try(BufferedReader br = new BufferedReader(new FileReader(EMPLOYEE_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) {
                    try {
                        Employee employee = new Employee(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]), data[5], data[6]);
                        employees.add(employee);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid data format" + e.getMessage());
                    }
                } else {
                    System.out.println("Không đủ dữ liệu ở dòng: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFile() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(EMPLOYEE_FILE_PATH))) {
            for (Employee employee : employees) {
                bw.write(String.format("%s,%s,%s,%s,%2f,%s,%s",
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getEmail(),
                        employee.getSalary(),
                        employee.getDepartment(),
                        employee.getPosition()
                ));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file " + e.getMessage());
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public boolean addEmployee(Employee employee) {
        for (Employee e : employees) {
            if (e.getId().equals(employee.getId())) {
                return false;
            }
        }
        employees.add(employee);
        saveFile();
        return true;
    }

    public boolean updateEmployee(String id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                employees.set(i, employee);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                employees.remove(i);
                saveFile();
                return true;
            }
        }
        return false;
    }
}
