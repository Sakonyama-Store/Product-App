package SakonyamaStore.product_app.repository;

import SakonyamaStore.product_app.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
