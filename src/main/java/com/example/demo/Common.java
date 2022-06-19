package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Common {


    @GetMapping("")
    public String Start(){
        return "Service Working";
    }

    @GetMapping("/*")
    public String Error(){
        return "pagina no encontrada";
    }

}
