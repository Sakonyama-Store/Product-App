package SakonyamaStore.Product_App.repository;

import SakonyamaStore.Product_App.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
