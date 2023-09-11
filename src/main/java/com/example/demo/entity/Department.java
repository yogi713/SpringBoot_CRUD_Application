package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long departmentID;
    private String departmentName;
    private String studentName;
    private Double cgpa;
}
