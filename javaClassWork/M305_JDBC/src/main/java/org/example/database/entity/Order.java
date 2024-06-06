package org.example.database.entity;



import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Temporal(TemporalType.DATE)
    @Column(name ="order_date")
    private Date orderDate;

    @Temporal(TemporalType.DATE)
    @Column(name ="required_date")
    private Date  requiredDate;

    @Temporal(TemporalType.DATE)
    @Column(name ="shipped_date")
    private Date shippedDate;

    @Column(name ="comments")
    private String comments;

}