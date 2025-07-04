package final_test_module2.view;

import java.util.Scanner;

public class MainView {
    static Scanner sc = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("=================MENU===============");
        System.out.println("--------1. Hiển thị danh bạ --------");
        System.out.println("--------2. Thêm danh bạ mới --------");
        System.out.println("--------3. Cập nhật danh bạ --------");
        System.out.println("--------4. Xóa danh bạ -------------");
        System.out.println("--------5. Tìm kiếm ----------------");
        System.out.println("--------6. Đọc từ file -------------");
        System.out.println("--------7. Ghi vào file ------------");
        System.out.println("--------8. Thoát -------------------");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
