package com.example.dockerp;

import lombok.Data;

import javax.persistence.*;

/**
 * created by Admin on 10/31/2022
 * author: Admin
 * project: docker-p
 */

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;
}
