package org.example.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "office_id")
    private Integer officeId;


    @Column(name = "lastname")
    private String lastName;

    @Column(name ="firstname")
    private String firstName;

    private String extension;

    private String email;

    @Column(name ="reports_to")
    private Integer reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name="vacation_hours")
    private Integer vacationHours;

    @Column(name= "profile_image_url")
    private String profileImageURL;


}
