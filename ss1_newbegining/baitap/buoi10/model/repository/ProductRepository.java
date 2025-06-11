package baitap.buoi10.model.repository;

import baitap.buoi10.model.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product());
        products.add(new Product());
        products.add(new Product());
    }

    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void deleteProduct(String id){
        for(Product product : products){
            if (product.getId().equals(id)){
                products.remove(product);
            }
        }
    }

    public void updateProduct(String id, Product product){
        for (Product product1 : products){
            if (product1.getId().equals(id)){
                product1.setId(product.getId());
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
            }
        }
    }

    public void sortProducts(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    public Product searchProduct(String name){
        List<Product> productList = new ArrayList<>();
        for(Product product : products){
            if (product.getName().equals(name)){
                productList.add(product);
            }
        }
        return (Product) productList;
    }
}
