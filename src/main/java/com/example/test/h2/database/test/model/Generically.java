package com.example.test.h2.database.test.model;

import javax.persistence.*;

@Entity
public class Generically {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String namess;

    public Generically(String value) {
        this.namess = value;
    }

    public Generically( ) {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return namess;
    }

    public void setValue(String value) {
        this.namess = value;
    }

    //standard constructors, getters, setters
}