package com.example.demo.WebRestFull;


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
class EmployeeRest {
    @Id
    @GeneratedValue
    private  Long id;

    private String name2;
    private String role2;

    EmployeeRest() {}

    EmployeeRest(String name2, String role2) {

        this.name2 = name2;
        this.role2 = role2;
    }

}