package baitap.buoi10.controller;

import baitap.buoi10.model.entity.Product;
import baitap.buoi10.model.service.IProductService;
import baitap.buoi10.model.service.ProductService;

import java.util.List;

public class ProductController {
    IProductService productService = new ProductService();

    public List<Product> getAllProducts(){ return productService.getAllProducts(); }

    public void addProduct (Product product){ productService.addProduct(product); }

    public void deleteProduct (String id){ productService.deleteProduct(id);}

    public void updateProduct (String id, Product product){ productService.updateProduct(id, product); }

    public void sortProduct() { productService.sortProducts(); }

    public Product searchProduct(String id){ return productService.searchProduct(id); }
}
