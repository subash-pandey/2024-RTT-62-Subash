package org.example.database.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name ="order_date")
    private String orderDate;

    @Column(name ="required_date")
    private String requiredDate;

    @Column(name ="shipped_date")
    private String shippedDate;

    @Column(name ="comments")
    private String comments;

}