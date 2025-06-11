package baitap.buoi10.view;

import java.util.Scanner;

public class MainView {
    static Scanner sc = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("=============PRODUCT MENU==============");
        System.out.println("----1. Hiển thị danh sách-------");
        System.out.println("----2. Thêm sản phẩm------------");
        System.out.println("----3. Sửa sản phẩm theo id-----");
        System.out.println("----4. Xóa sản phẩm theo id-----");
        System.out.println("----5. Tìm kiếm sản phẩm theo tên---");
        System.out.println("----6. Sắp xếp sản phẩm theo giá----");
        System.out.println("----7. Thoát-----");
        System.out.println("========================================");
        System.out.print("Hãy nhập lựa chọn của bạn: ");
        Integer choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
