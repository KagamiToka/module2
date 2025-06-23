package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.service;

import baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void addProduct(Product product);
}
