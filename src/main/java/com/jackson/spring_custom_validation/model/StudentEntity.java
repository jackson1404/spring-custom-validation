package com.jackson.spring_custom_validation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;

    private String studentEmail;

}
