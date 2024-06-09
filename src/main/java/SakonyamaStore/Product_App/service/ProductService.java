package SakonyamaStore.Product_App.service;

import SakonyamaStore.Product_App.Entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getProducts();

}
