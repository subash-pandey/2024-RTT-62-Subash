package com.example.springboot.form;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {


    private Integer customerId;

    @NotEmpty(message ="Customer Name is required")
    private String customerName;
    private String contactFirstName;
    private String contactLastName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Integer salesRep;
    private Double  creditLimit;

}
