package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.view;

import java.util.Scanner;

public class MainView {
    static Scanner sc = new Scanner(System.in);
    public int displayMenu() {
        System.out.println("===============MENU===============");
        System.out.println("--------1. Hiển thị danh sách-----");
        System.out.println("--------2. Thêm mới sản phẩm------");
        System.out.println("--------3. Thoát chương trình-----");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
