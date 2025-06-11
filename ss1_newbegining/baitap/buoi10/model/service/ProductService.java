package baitap.buoi10.model.service;

import baitap.buoi10.model.entity.Product;
import baitap.buoi10.model.repository.ProductRepository;

import java.security.Provider;
import java.util.List;

public class ProductService implements IProductService {

    ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public void updateProduct(String id, Product product) {
        productRepository.updateProduct(id, product);
    }

    @Override
    public void sortProducts() {
        productRepository.sortProducts();
    }

    @Override
    public Product searchProduct(String name) {
        return productRepository.searchProduct(name);
    }
}
