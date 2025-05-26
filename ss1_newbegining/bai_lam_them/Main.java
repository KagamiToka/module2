package bai_lam_them;

import java.util.Scanner;

public class Main {
    static ProductList productList = new ProductList();
    static Scanner sc = new Scanner(System.in);
    private static final int LIST_PRODUCT = 1;
    private static final int ADD_NEW_PRODUCT = 2;
    private static final int EDIT_PRODUCT = 3;
    private static final int DELETE_PRODUCT = 4;
    private static final int EXIT_PROGRAM = 5;
    public static int menu() {
        System.out.println("---------------Menu---------------");
        System.out.println("-------1. List products-----");
        System.out.println("-------2. Add new product-----");
        System.out.println("-------3. Edit product-----");
        System.out.println("-------4. Delete product-----");
        System.out.println("-------5. Exit program-----");
        System.out.print("Hãy nhập lựa chọn của bạn: ");
        int choose = Integer.parseInt(sc.nextLine());
        return choose;
    }

    public static void listProducts() {
        System.out.println("---------------------------");
        for (Product product : productList.getProducts()) {
            if (product != null) {
                System.out.println(product);
            } else {
                System.out.println("Không có sản phẩm nào");
            }
        }
        System.out.println("---------------------------");
    }

    public static void addNewProduct() {
        System.out.println("---------------------------");
        System.out.print("Nhập ID của sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên của sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        productList.addProduct(new Product(id, name, price));
        System.out.println("---------------------------");
    }

    public static void editProduct() {
        System.out.println("---------------------------");
        System.out.print("Nhập  ID mới của sản phẩm: ");
        int newID = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên mới của sản phẩm: ");
        String newName = sc.nextLine();
        System.out.print("Nhập giá mới của sản phẩm: ");
        double newPrice = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập ID của sản phẩm cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        if (productList.getProductByID(id) == null) {
            System.out.println("Không có sản phẩm nào với ID " + id);
        } else {
            productList.editProduct(new Product(newID, newName, newPrice),id);
        }
        System.out.println("---------------------------");
    }

    public static void deleteProduct() {
        System.out.println("---------------------------");
        System.out.print("Nhập ID của sản phẩm cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        if (productList.getProductByID(id) == null) {
            System.out.println("Không có sản phẩm nào với ID " + id);
        } else {
            productList.deleteProduct(id);
            System.out.println("Sản phẩm đã được xóa");
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            choice = menu();
            switch (choice) {
                case LIST_PRODUCT:
                    System.out.println("List products");
                    listProducts();
                    break;
                case ADD_NEW_PRODUCT:
                    System.out.println("Add new product");
                    addNewProduct();
                    break;
                case EDIT_PRODUCT:
                    System.out.println("Edit product");
                    editProduct();
                    break;
                case DELETE_PRODUCT:
                    System.out.println("Delete product");
                    deleteProduct();
                    System.out.println("Danh sách sản phẩm sau khi xóa: ");
                    listProducts();
                    break;
                case EXIT_PROGRAM:
                    System.out.println("------Exit program------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn nào này, vui lòng nhập lại:");
            }
        }
    }

}
