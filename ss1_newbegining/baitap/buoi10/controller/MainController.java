package baitap.buoi10.controller;

import baitap.buoi10.model.entity.Product;
import baitap.buoi10.view.MainView;

import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner sc = new Scanner(System.in);
    static MainView view = new MainView();
    static ProductController controller = new ProductController();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1:
                    getAllProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Do not have this choice");
            }
        }
    }

    private static void getAllProducts() {
        System.out.println("========================================");
        List<Product> products = controller.getAllProducts();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("========================================");
    }

    private static void addProduct() {
        System.out.println("========================================");
        System.out.print("Hãy nhập ID: ");
        String newId = sc.nextLine();
        System.out.print("Hãy nhập tên sản phẩm: ");
        String newName = sc.nextLine();
        System.out.print("Hãy nhập giá của sản phẩm: ");
        Double newPrice = Double.parseDouble(sc.nextLine());
        System.out.println("========================================");
        controller.addProduct(new Product(newId, newName, newPrice));
    }

    private static void deleteProduct() {
        System.out.println("========================================");
        System.out.print("Nhập id sản phẩm cần xóa: ");
        String id = sc.nextLine();
        controller.deleteProduct(id);
        System.out.println("---------AFTER DELETE---------");
        getAllProducts();
        System.out.println("========================================");
    }

    private static void updateProduct() {
        System.out.println("========================================");
        System.out.print("Nhập id sản phẩm cần sửa: ");
        String id = sc.nextLine();
        System.out.print("Nhập ID mới: ");
        String newId = sc.nextLine();
        System.out.print("Nhập tên mới: ");
        String newName = sc.nextLine();
        System.out.print("Nhập giá mới: ");
        Double newPrice = Double.parseDouble(sc.nextLine());
        controller.updateProduct(id,new Product(newId,newName,newPrice));
        System.out.println("---------AFTER UPDATE---------");
        getAllProducts();
        System.out.println("========================================");
    }

    private static void sortProduct() {
        System.out.println("=======================================");
        controller.sortProduct();
        System.out.println("---------AFTER SORT---------");
        getAllProducts();
        System.out.println("=======================================");
    }

    private static void searchProduct() {
        System.out.println("=======================================");
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine();
        for (Product product : controller.getAllProducts()) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
        System.out.println("=======================================");
    }
}
