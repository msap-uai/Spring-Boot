package com.example.demo.SpringDataJPA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
//CustomerRepositoryhereda varios métodos para trabajar con Customerpersistencia, incluidos métodos para guardar, eliminar y buscar Customerentidades
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

}