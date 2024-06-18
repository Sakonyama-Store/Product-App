package SakonyamaStore.Product_App.Controller;


import SakonyamaStore.Product_App.Entity.Product;
import SakonyamaStore.Product_App.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class GetController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        List<Product> products = productService.getProducts();
        System.out.println(products);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    

}
