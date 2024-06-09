package SakonyamaStore.Product_App.service.impl;

import SakonyamaStore.Product_App.Entity.Product;
import SakonyamaStore.Product_App.repository.ProductRepository;
import SakonyamaStore.Product_App.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        Product res = productRepository.save(product);
        return res;
    }

    @Override
    public List<Product> getProducts() {

        List<Product> products = (List<Product>) productRepository.findAll();

        return products;
    }
}
