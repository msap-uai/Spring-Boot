package com.example.demo.WebRestFull;


class EmployeeRestNotFoundException extends RuntimeException {
    public EmployeeRestNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
//es una excepción que se utiliza para indicar cuándo se busca un empleado pero no se encuentra.
