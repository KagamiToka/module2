package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.controller;

import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.entity.Product;
import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.service.IProductService;
import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.service.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public List<Product> getProducts() { return productService.getAll(); }

    public void addProduct(Product product) { productService.addProduct(product); }
}
