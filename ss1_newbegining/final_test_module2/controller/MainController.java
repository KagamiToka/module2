package final_test_module2.controller;

import final_test_module2.model.entity.DanhBa;
import final_test_module2.view.MainView;

import java.util.Scanner;

public class MainController {
    static Scanner sc = new Scanner(System.in);
    private static MainView mainView = new MainView();
    private static DanhBaController danhBaController = new DanhBaController();
    private static final String SO_DIEN_THOAI_REGEX = "0\\d{9}|\\d{10}";
    private static final String EMAIL_REGEX = "\\w+@\\w+\\.\\w+";

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int choice = mainView.displayMenu();
            switch (choice) {
                case 1:
                    getListDanhBa();
                    break;
                case 2:
                    addDanhBa();
                    break;
                case 3:
                    updateDanhBa();
                    break;
                case 4:
                    removeDanhBa();
                    break;
                case 5:
                    searchDanhBa();
                    break;
                case 6:
                    System.out.print("Bạn có muốn cập nhật (Y/N): ");
                    String comfirm = sc.nextLine();
                    if (comfirm.equals("Y")) {
                        danhBaController.readFile();
                        System.out.println("Đã đọc thành công");
                    }
//                    if (danhBaController.listDanhBa().size() != 0) {
//                        danhBaController.listDanhBa().forEach(danhBaController.listDanhBa()::remove);
//                        System.out.print("Bạn có muốn cập nhật (Y/N): ");
//                        String comfirm = sc.nextLine();
//                        if (comfirm.equals("Y")) {
//                            danhBaController.readFile();
//                            System.out.println("Đã đọc thành công");
//                        }
//                    } else {
//                        System.out.print("Bạn có muốn cập nhật (Y/N): ");
//                        String comfirm = sc.nextLine();
//                        if (comfirm.equals("Y")) {
//                            danhBaController.readFile();
//                            System.out.println("Đã đọc thành công");
//                        }
//                    }
                    break;
                case 7:
                    System.out.print("Bạn có muốn cập nhật (Y/N): ");
                    String comfirm2 = sc.nextLine();
                    if (comfirm2.equals("Y")) {
                        danhBaController.saveFile();
                        System.out.println("Đã ghi thành công");
                    }
                    break;
                case 8:
                    System.out.println("Thoát chương trình....");
                    flag = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này vui lòng chọn lại");
            }
        }
    }

    private static void getListDanhBa() {
        System.out.println("=================DANH BA LIST==============");
        for (DanhBa danhBa : danhBaController.listDanhBa()) {
            System.out.println("Số điện thoại: " + danhBa.getSoDienThoai());
            System.out.println("Nhóm:" + danhBa.getNhom());
            System.out.println("Họ tên:" + danhBa.getHoTen());
            System.out.println("Giới tính:" + danhBa.getGioiTinh());
            System.out.println("Địa chỉ:" + danhBa.getDiaChi());
            System.out.println("------------------------------------");
        }
        System.out.println("===========================================");
    }

    private static void addDanhBa() {
        System.out.println("==================DANH BA ADD===============");
        String soDienThoai;
        do {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai = sc.nextLine();
        } while (!soDienThoai.matches(SO_DIEN_THOAI_REGEX));
        System.out.print("Nhập nhóm danh bạ: ");
        String nhom = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String ngaySinh = sc.nextLine();
        String email;
        do {
            System.out.print("Nhập email: ");
            email = sc.nextLine();
        } while (!email.matches(EMAIL_REGEX));
        danhBaController.addDanhBa(new DanhBa(soDienThoai,nhom,hoTen,gioiTinh,diaChi,ngaySinh,email));
        System.out.println("================================================");
    }

    private static void removeDanhBa() {
        System.out.println("===================DANH BA REMOVE===============");
        System.out.print("Nhập số điện thoại cần xóa: ");
        String soDienThoai = sc.nextLine();
        if (danhBaController.getSoDienThoai(soDienThoai)){
            System.out.print("Bạn có muốn xóa số điện thoại này (Y/N)?: ");
            String comfirm = sc.nextLine();
            if (comfirm.equalsIgnoreCase("Y")) {
                danhBaController.deleteDanhBa(soDienThoai);
            }
        } else {
            System.out.println("Không tìm thấy số điện thoại này");
        }

        System.out.println("================================================");
    }

    private static void updateDanhBa() {
        System.out.println("===================DANH BA UPDATE===============");
        String soDienThoai;
        do {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai = sc.nextLine();
        } while (!soDienThoai.matches(SO_DIEN_THOAI_REGEX));
        if (danhBaController.getSoDienThoai(soDienThoai)){
            System.out.print("Nhập nhóm danh bạ: ");
            String nhom = sc.nextLine();
            System.out.print("Nhập họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhập giới tính: ");
            String gioiTinh = sc.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String diaChi = sc.nextLine();
            System.out.print("Nhập ngày sinh: ");
            String ngaySinh = sc.nextLine();
            String email;
            do {
                System.out.print("Nhập email: ");
                email = sc.nextLine();
            } while (!email.matches(EMAIL_REGEX));
            danhBaController.updateDanhBa(soDienThoai, new DanhBa(soDienThoai,nhom,hoTen,gioiTinh,diaChi,ngaySinh,email));
        } else {
            System.out.println("Không tìm thấy số này");
        }
        System.out.println("================================================");
    }

    private static void searchDanhBa() {
        System.out.println("===================DANH BA SEARCH===============");
        String soDienThoai;
        do {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai = sc.nextLine();
        } while (!soDienThoai.matches(SO_DIEN_THOAI_REGEX));
        System.out.println(danhBaController.getDanhBa(soDienThoai));
    }
}
