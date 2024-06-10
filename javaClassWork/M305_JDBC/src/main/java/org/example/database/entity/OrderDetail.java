package org.example.database.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderdetails")
@ToString
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional =true)
    @JoinColumn(name = "order_id", nullable = true)
    private Order order;

    @Column(name = "order_id",insertable = false, updatable = false)
    private Integer orderId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional =true)
    @JoinColumn(name = "product_id", nullable = true)
    private Product product;

    @Column(name = "quantity_ordered")
    private Integer quantityOrdered =0;

    @Column(name ="product_id",insertable = false,updatable = false)
    private Integer productId;

    @Column(name ="price_each", columnDefinition = "DECIMAL")
    private Double priceEach =0.0;



    @Column(name ="order_line_number",columnDefinition = "SMALLINT")
    private Integer orderLineNumber;


}
