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

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name ="product_id")
    private Integer productId;

    @Column(name ="price_each", columnDefinition = "DECIMAL")
    private Double priceEach;

    @Column(name ="order_line_number",columnDefinition = "SMALLINT")
    private Integer orderLineNumber;


}
