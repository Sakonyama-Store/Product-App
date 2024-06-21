package SakonyamaStore.product_app.service;

import SakonyamaStore.product_app.Entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getProducts();

}
