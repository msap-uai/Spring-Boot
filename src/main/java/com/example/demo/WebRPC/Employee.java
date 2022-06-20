package com.example.demo.WebRPC;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public
class Employee {
    @Id
    @GeneratedValue
    private  Long id;

    private String name;
    private String role;

    Employee() {}

    Employee(String name, String role) {

        this.name = name;
        this.role = role;
    }

}
