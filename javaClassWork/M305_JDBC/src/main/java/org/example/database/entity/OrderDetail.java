package org.example.database.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "orderdetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name ="product_id")
    private Integer productId;

    @Column(name ="price_each")
    private Double priceEach;

    @Column(name ="order_line_number")
    private Integer orderLineNumber;


}
