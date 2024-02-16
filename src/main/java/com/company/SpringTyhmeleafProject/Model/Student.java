package com.company.SpringTyhmeleafProject.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "surname",nullable = false)
    private String surname;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "groupNumber",nullable = false,unique = true)
    private String groupNumber;
}
