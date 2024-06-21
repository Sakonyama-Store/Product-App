package SakonyamaStore.product_app.Controller;

import SakonyamaStore.product_app.Entity.Product;
import SakonyamaStore.product_app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class postActions {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){

        Product res = productService.addProduct(product);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
