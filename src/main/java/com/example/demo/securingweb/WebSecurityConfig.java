package com.example.demo.securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
/*
@Configuration
@EnableWebSecurity //habilitar el soporte de seguridad web de Spring Security

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //define qué rutas de URL deben protegerse y cuáles no.
        http
                .authorizeRequests()
                    .antMatchers("/WS", "/WS/home").permitAll() // sin autorizacion
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/WS/login")
                    .permitAll() //usuario utentificados o remitidos al formulacio
                    .and()
                .logout()
                    .permitAll();
    }
    //PONGO EN AUTORIZADOS A TODOS ASI NO IMPIDE LOS OTROS SERVICIOS
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("password")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
    // SE DEAHBILITO EN MAIN PARA NO TENER QUE VALIDAR EL USUARIO
}
*/