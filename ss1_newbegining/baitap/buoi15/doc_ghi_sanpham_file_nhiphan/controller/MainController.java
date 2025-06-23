package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.controller;


import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.entity.Product;
import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.view.MainView;

import java.util.Date;
import java.util.Scanner;

public class MainController {
    static Scanner sc = new Scanner(System.in);
    static ProductController pc = new ProductController();
    private static MainView view = new MainView();
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int choice = view.displayMenu();
            switch (choice) {
              case 1:
                  getProduct();
                  break;
              case 2:
                  addProduct();
                  break;
              case 3:
                  System.out.println("Thoát chương trình...");
                  flag = false;
                  break;
              default:
                  System.out.println("Không có lụ chọn này");
            }
        }
    }

    private static void getProduct() {
        System.out.println("===============LIST PRODUCT===============");
        for (Product product : pc.getProducts()) {
            System.out.println(product);
        }
        System.out.println("==========================================");
    }

    private static void addProduct() {
        System.out.println("===============ADD PRODUCT===============");
        System.out.print("Nhập mã sản phẩm: ");
        String newMaSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String newTenSP = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Double newGiaSP = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        String newHangSanXuat = sc.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        String newMoTa = sc.nextLine();
        pc.addProduct(new Product(newMaSP,newTenSP, newGiaSP, newHangSanXuat, newMoTa));
    }
}
