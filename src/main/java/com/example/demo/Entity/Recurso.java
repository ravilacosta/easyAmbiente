package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recurso")
@EqualsAndHashCode(callSuper = false)

public class Recurso extends BaseEntity {
    

    @Column(nullable = false)
    private String nome;

}
