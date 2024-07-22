package com.example.springboot.database.entity;




import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

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

    @ToString.Exclude
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional =true)
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;


    @Column(name = "customer_id",insertable = false,updatable = false)
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
