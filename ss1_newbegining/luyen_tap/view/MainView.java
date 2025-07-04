package luyen_tap.view;

import java.util.Scanner;

public class MainView {
    static Scanner sc = new Scanner(System.in);
    public int displayMenu() {
        System.out.println("=================MENU================");
        System.out.println("--1. Thêm mới phương tiện -----------");
        System.out.println("--2. Hiển thị danh sách phương tiện--");
        System.out.println("--3. Tìm kiếm phương tiện -----------");
        System.out.println("--4. Xóa phương tiện ----------------");
        System.out.println("--5. Thoát --------------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int addMenu() {
        System.out.println("==============ADD MENU=============");
        System.out.println("----1. Thêm DRONE bay -------------");
        System.out.println("----2. Thêm Xe tuần tra mặt trăng--");
        System.out.println("----3. Quay lại -------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int listMenu() {
        System.out.println("===============LIST MENU===============");
        System.out.println("----1. Hiển thị DRONE bay -------------");
        System.out.println("----2. Hiển thị Xe tuần tra mặt trăng--");
        System.out.println("----3. Quay lại -----------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int deleteMenu() {
        System.out.println("============DELETE MENU===========");
        System.out.println("----1. Xóa DRONE bay -------------");
        System.out.println("----2. Xóa Xe tuần tra mặt trăng--");
        System.out.println("----3. Quay lại ------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int searchMenu() {
        System.out.println("===============SEARCH MENU=============");
        System.out.println("----1. Tìm kiếm DRONE bay -------------");
        System.out.println("----2. Tìm kiếm Xe tuần tra mặt trăng--");
        System.out.println("----3. Quay lại -----------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
