package org.example.database.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name ="product_name")
    private String productName;

    @Column(name ="productline_id")
    private Integer productLineId;

    @Column(name ="product_scale")
    private String productScale;

    @Column(name ="product_vendor")
    private String productVendor;

    @Column(name ="product_description")
    private String productDescription;

    @Column(name ="quantity_in_stock")
    private String quantityInStock;

    @Column(name ="buy_price")
    private Double buyPrice;

    @Column(name ="msrp")
    private Double msrp;

    

}