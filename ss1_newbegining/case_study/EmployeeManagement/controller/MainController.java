package case_study.EmployeeManagement.controller;

import case_study.EmployeeManagement.model.entity.Employee;
import case_study.EmployeeManagement.view.MainView;

import java.util.Scanner;

public class MainController {
    static Scanner sc = new Scanner(System.in);
    private static EmployeeController employeeController = new EmployeeController();
    private static MainView mainView = new MainView();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int choice = mainView.displayMenu();
            switch (choice) {
                case 1:
                    listEmployees();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    flag = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private static void listEmployees() {
        System.out.println("============LIST EMPLOYEES===========");
        for (Employee employee : employeeController.getEmployees()) {
            System.out.println(employee);
        }
        System.out.println("=====================================");
    }

    private static void addEmployee() {
        System.out.println("==============ADD EMPLOYEE===========");
        System.out.print("Mời nhập emp ID: ");
        String id = sc.nextLine();
        System.out.print("Mời nhập emp firstname: ");
        String firstname = sc.nextLine();
        System.out.print("Mời nhập emp lastname: ");
        String lastname = sc.nextLine();
        System.out.print("Mời nhập emp email: ");
        String email = sc.nextLine();
        System.out.print("Mời nhập emp salary: ");
        Double salary = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập emp department: ");
        String department = sc.nextLine();
        System.out.print("Mời nhập emp position: ");
        String position = sc.nextLine();
        employeeController.addEmployee(new Employee(id,firstname,lastname,email,salary,department,position));
        System.out.println("====================================");
    }

    private static void deleteEmployee() {
        System.out.println("==============DELETE EMPLOYEE===========");
        System.out.print("Mời nhập emp ID muốn xóa: ");
        String id = sc.nextLine();
        employeeController.deleteEmployee(id);
        System.out.println("========================================");
    }

    private static void updateEmployee() {
        System.out.println("===============UPDATE EMPLOYEE===========");
        System.out.print("Mời nhập emp ID cần chỉnh sửa: ");
        String editId = sc.nextLine();
        System.out.print("Mời nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Mời nhập Firstname: ");
        String firstname = sc.nextLine();
        System.out.print("Mời nhập Lastname: ");
        String lastname = sc.nextLine();
        System.out.print("Mời nhập Email: ");
        String email = sc.nextLine();
        System.out.print("Mời nhập Salary: ");
        Double salary = Double.parseDouble(sc.nextLine());
        System.out.print("Mời nhập Department: ");
        String department = sc.nextLine();
        System.out.print("Mời nhập Position: ");
        String position = sc.nextLine();
        employeeController.updateEmployee(editId,new Employee(id,firstname,lastname,email,salary,department,position));
        System.out.println("======================================");
    }
}
