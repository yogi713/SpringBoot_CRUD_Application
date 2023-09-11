package com.example.demo.entity;

import java.util.Arrays;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
// Data equivalent to getters, setters, hashcode(), equals() methods and argsConstructor
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long departmentID;
//    @NotBlank(message = "Kindly Provide DepartmentName to query..!")
//    @NotEmpty
//    @NotNull
//    @Past
//    @PastOrPresent
//    @Future
//    @FutureOrPresent
//    @DateTimeFormat
//    @Email
//    @NegativeOrZero
//    @Length(max = 12, min = 0)
//    @Size(min = 2, max = 7)
    private String departmentName;
    private String studentName;
    private Double cgpa;
}
