package bai_lam_them;

import java.util.Arrays;

public class ProductList {
    private Product[] products = {
            new Product(1, "Laptop", 1000000),
            new Product(2, "Máy in", 500000),
            new Product(3, "Camera", 10000000),
            new Product(4, "CPU", 10000000)
    };

    public Product[] getProducts() {
        return products;
    }

    public Product getProductByID(int id) {
        for (Product product : products) {
            if (product != null && product.getId() == id) {
                return product;
            }
        }
        return null;
    }

//    private void resize() {
//        int newCapacity = products.length + 1;
//        Product[] newProducts = new Product[newCapacity];
//        for (int i = 0; i < products.length; i++) {
//            newProducts[i] = products[i];
//        }
//        products = newProducts;
//    }

    public Product[] addProduct(Product[] productList, Product product) {
        Product[] newProducts = new Product[productList.length + 1];
        for (int i = 0; i < products.length; i++) {
            newProducts[i] = productList[i];
//            if (products[i] == null) {
//                resize();
//            }
//            products[i] = product;
        }
        newProducts[productList.length] = product;
        return newProducts;
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = null;
                return;
            }
        }
    }

    public void editProduct(Product product, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = product;
                return;
            }
        }
    }
}
