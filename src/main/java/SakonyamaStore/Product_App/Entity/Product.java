package SakonyamaStore.Product_App.Entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="product_detail")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Double price;

    private String description;

}
