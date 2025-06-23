package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.service;

import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.entity.Product;
import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getProducts();
    }

    @Override
    public void addProduct(Product product) {
        if (productRepository.addProduct(product)) {
            System.out.println("Added product successfully");
        } else  {
            System.out.println("Failed to add product");
        }
    }
}
