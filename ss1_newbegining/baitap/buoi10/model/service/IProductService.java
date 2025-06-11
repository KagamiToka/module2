package baitap.buoi10.model.service;

import baitap.buoi10.model.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(String id);
    void updateProduct(String id, Product product);
    void sortProducts();
    Product searchProduct(String name);
}
