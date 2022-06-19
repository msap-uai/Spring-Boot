package com.example.demo.validatingforminput;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.Date;

//hibernate
//@ScriptAssert(lang="javascript",script="(_this.password!=null)?  _this.password.equals(_this.confirmPassword) : false",message="Los 2 passwords deben ser iguales")
//La anotación @ScriptAssert nos permitirá ejecutar una expresión en el lenguaje JavaScript 3) usando dentro del código cualquier propiedad de la clase.


//lombok
@Getter
@Setter
@ToString
public class PersonForm {

    //Hibernate validaciones

    private String password; //validado con @ScriptAssert


    @NotNull
    @NotBlank //Comprueba que el String no sea null y que al hacer un trim() aún haya algún caracter
    @Size(min=2, max=30)
    //@Pattern(regexp=“r”) //Comprueba que el valor se ajusta a la expresión regular r
    private String name;

    @NotNull // no puede ser nulo
    //@Null
    @Min(18)
    //@Max(88)
    //@Digits(integer=n, fraction=m) //cualquier numero
    private Integer age;

    //@AssertFalse
    //@AssertTrue //debe ser verdadero
    private boolean active;

    @Future // deve ser una fecha mayor a la cual
    //@Past
    private Date hoy;

    @Email
    private String email;

    //@Valid
    //private Object object;


}
