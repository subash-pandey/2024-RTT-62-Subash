package com.example.springboot.form;

import com.example.springboot.validation.EmployeeEmailUnique;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private Integer employeeId;

    @NotEmpty(message="Email is required")
    @EmployeeEmailUnique(message = "Email has to be unique!!!")
    private String email;

    @Length(max =50, message ="First name must be less than 50 characters")
    @NotEmpty(message ="First Name is required")
    private String firstName;

    @NotEmpty(message ="We do need a last Name")
    private String lastName;

    private Integer reportsTo;
    private Integer officeId;
    private String  jobTitle;
    private String extension;


}
