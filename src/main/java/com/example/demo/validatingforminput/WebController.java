package com.example.demo.validatingforminput;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
@RequestMapping("/Validate")
public class WebController implements WebMvcConfigurer {

    //@Override
    /*
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/formResults").setViewName("formResults");
    }
    */
    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "formValid";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {
        //@Valid obliga areunir los atributos rellenados en el formulario.

        if (bindingResult.hasErrors()) {
            //bindingResultobjeto recupera errores de validación.
            return "formValid";
        }

        //return "redirect:formResults";
        return "formResults";
    }
}
