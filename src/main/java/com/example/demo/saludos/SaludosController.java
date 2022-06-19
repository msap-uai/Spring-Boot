package com.example.demo.saludos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//maneja las solicitudes /saludos/
@RestController //RESTFULL. devuelve un jason
public class SaludosController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/saludos") //HTTP tipo Get
    public SaludosModel saludos(@RequestParam(value = "nombre", defaultValue = "World") String nombre) //?name=User
    {
        return new SaludosModel(counter.incrementAndGet(), String.format(template, nombre));
    }

    //@PostMapping
    //@DeleteMapping


}
