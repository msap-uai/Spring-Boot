package com.example.demo.DB_JDBC;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JDCB_Customer {
    private long id;
    private String firstName, lastName;

    public JDCB_Customer(long id, String first_name, String last_name) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
