package com.example.demo.WebRPC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmployeeDataBase {
    private static final Logger log = LoggerFactory.getLogger(EmployeeDataBase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
//Cuando se carga Spring Boot ejecutará TODOS CommandLineRunner.
// los beans una vez que se cargue el contexto de la aplicación.
//solicitará una copia del EmployeeRepository que acaba de crear.
//Utilizándolo, creará dos entidades y las almacenará.
