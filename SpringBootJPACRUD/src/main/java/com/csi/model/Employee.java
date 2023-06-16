package com.csi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    @Id
    @GeneratedValue
    private int empId;

    private String empFirstName;

    private String empLastName;

    private String empEmailId;

}
