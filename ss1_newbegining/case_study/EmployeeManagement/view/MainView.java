package case_study.EmployeeManagement.view;

import java.util.Scanner;

public class MainView {
    static Scanner sc = new Scanner(System.in);
    public int displayMenu() {
        System.out.println("================MENU==============");
        System.out.println("---------1.List Employees---------");
        System.out.println("---------2. Add Employee----------");
        System.out.println("---------3. Update Employee-------");
        System.out.println("---------4. Delete Employee-------");
        System.out.println("---------5. Exit------------------");
        System.out.println("==================================");
        System.out.print("Mời nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
