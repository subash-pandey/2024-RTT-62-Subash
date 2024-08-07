package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.query.Page;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "employees")
public class Employee {

    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;


    @ToString.Exclude
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Customer> customers;


    @Column(name = "office_id")
    private Integer officeId;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private Integer reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private Integer vacationHours;

    @Column(name = "profile_image_url")
    private String profileImageUrl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return getId().equals(employee.getId()) && getLastName().equals(employee.getLastName()) && getFirstName().equals(employee.getFirstName());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getFirstName().hashCode();
        return result;
    }
}
