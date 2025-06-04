package bai_tap_lam_them.view;

import java.util.Scanner;

public class MainView {
    static final Scanner sc = new Scanner(System.in);
    public int displayMainView() {
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG----");
        System.out.println("-------1.Thên mới Phương tiện-------");
        System.out.println("-------2.Hiển thị phương tiện-------");
        System.out.println("-------3.Xóa phương tiện------------");
        System.out.println("-------4.Thoát----------------------");
        System.out.print("Mời nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int displayAddView() {
        System.out.println("----THÊM MỚI PHƯƠNG TIỆN GIAO THÔNG----");
        System.out.println("---------1. Thêm xe tải--------");
        System.out.println("---------2. Thêm ôtô-----------");
        System.out.println("---------3. Thêm xe máy--------");
        System.out.println("---------4. Quay lại-----------");
        System.out.print("Mời nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public int displayListView() {
        System.out.println("----HIỂN THỊ PHƯƠNG TIỆN GIAO THÔNG----");
        System.out.println("----------1. Hiển thị xe tải-------");
        System.out.println("----------2. Hiển thị ôtô----------");
        System.out.println("----------3. Hiển thị xe máy-------");
        System.out.println("----------4. Quay lại--------------");
        System.out.print("Mời nhập lựa chọn của bạn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
