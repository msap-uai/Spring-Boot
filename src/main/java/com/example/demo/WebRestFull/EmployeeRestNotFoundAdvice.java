package com.example.demo.WebRestFull;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeRestNotFoundAdvice {

    @ResponseBody
    //indica que este consejo se presenta directamente en el cuerpo de respuesta.
    @ExceptionHandler(EmployeeRestNotFoundException.class)
    //configura el aviso para que solo responda si
    @ResponseStatus(HttpStatus.NOT_FOUND)
        //dice que emita un HttpStatus.NOT_FOUND, es decir, un HTTP 404 .
    String employeeNotFoundHandler(EmployeeRestNotFoundException ex) {
        return ex.getMessage();
    }
}
