package com.liquibasetest.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "teste_me")
public class TestMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

//    @Column
//    private String description;
}
