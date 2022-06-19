package com.example.demo.DB_JDBC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DB_JDBC_QUERY {

    private static final Logger log = LoggerFactory.getLogger(DB_JDBC_QUERY.class);

    @Autowired
    JdbcTemplate jdbcTemplate;
    //utilice Spring JdbcTemplatepara acceder a los datos almacenados en una base de datos relacional.

    //@PostConstruct
    //Spring llama a los métodos anotados con @PostConstruct solo una vez, justo después de la inicialización
    public void DB_JDBC_QUERY() throws Exception {

        log.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE DB_JDBC IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE DB_JDBC (id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        // Split up the array of whole names into an array of first/last names
        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        // Use a Java 8 stream to print out each tuple of the list
        splitUpNames.forEach(name -> log.info(String.format("Inserting DB_JDBC record for %s %s", name[0], name[1])));

        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        jdbcTemplate.batchUpdate("INSERT INTO DB_JDBC (first_name, last_name) VALUES (?,?)", splitUpNames);

        log.info("Querying for DB_JDBC records where first_name = 'Josh':");
        jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM DB_JDBC WHERE first_name = ?", new Object[] { "Josh" },
                (rs, rowNum) -> new JDCB_Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> log.info(customer.toString()));
    }


}
