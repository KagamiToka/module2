package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.repository;

import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    private static final String PRODUCT_BINARYFILE_PATH = "baitap/buoi15/doc_ghi_sanpham_file_nhiphan/data/products.dat";

    public ProductRepository() {
        readBinaryFile();
    }

    private void readBinaryFile() {
        File file = new File(PRODUCT_BINARYFILE_PATH);
        if (!file.exists() || file.length() == 0) {
            defaultData();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PRODUCT_BINARYFILE_PATH))) {
            products = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File nhị phân không tồn tại, hãy tạo mới danh sách");
            products = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file " +e.getMessage());
            products = new ArrayList<>();
        }
    }

    private void writeBinaryFile() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PRODUCT_BINARYFILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file " +e.getMessage());
        }
    }

    private void defaultData() {
        products.add(new Product("MH01", "Áo khoác Faker", 2000, "T1", "Áo khoác mang tên quỷ vương Faker"));
        products.add(new Product("MH02", "Labubu secret", 200, "Labubu", "Búp bê labubu secret"));
        products.add(new Product("MH03", "Mô hình nhà di dộng RV", 2000000, "RV", "Mô hình căn nhà di dộng giúp hiểu rõ hơn về cách hoạt động của 1 chiếc RV"));
        writeBinaryFile();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public boolean addProduct(Product product) {
        for (Product p : products) {
            if (p.getMaSanPham().equals(product.getMaSanPham())) {
                return false;
            }
        }
        products.add(product);
        writeBinaryFile();
        return true;
    }
}
