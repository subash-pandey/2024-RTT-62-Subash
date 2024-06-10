package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name ="contact_lastname")
    private String contactLastName;

    @Column(name ="contact_firstname")
    private String contactFirstName;

    @Column(name ="phone")
    private String phone;

    @Column(name ="address_line1")
    private String addressLine1;

    @Column(name ="address_line2")
    private String addressLine2;

    @Column(name ="city")
    private String city;

    @Column(name ="state")
    private String state;

    @Column(name ="postal_code")
    private String postalCode;

    @Column(name ="country")
    private String country;


      @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional =true)
    @JoinColumn(name = "sales_rep_employee_id", nullable = true)
    private Employee employee;


    @Column(name ="sales_rep_employee_id",insertable = false, updatable = false)
    private Integer salesRepEmployeeId;

    @Column(name ="credit_limit",columnDefinition = "DECIMAL")
    private Double creditLimit;




}
