package com.example.demo.WebRPC;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
//es una excepción que se utiliza para indicar cuándo se busca un empleado pero no se encuentra.
