package com.application.myproject.config;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.myproject.models.Clientes;
import com.application.myproject.repository.ClientesRepository;

import java.util.List;

@Configuration
public class ClientesConfig {

    @Bean
    CommandLineRunner CommandLineRunner(ClientesRepository repository){
        return args -> {
            Clientes cluadia = new Clientes(
                "Claudia",
                "Martes Garcias",
                20,
                LocalDate.of(2004, 7, 28),
                "martegarcias@gmail.com",
                "Caracas",
                "calle 123 San Pedro"
            );

            Clientes motete = new Clientes(
                "Motete",
                "Sanchez",
                19,
                LocalDate.of(2005, 1, 27),
                "sanchezmotete@gmail.com",
                "guatemala",
                "calle 123 San Isidro"
            );

            Clientes rudesca = new Clientes(
                "Rudesca",
                "Martinez cruz",
                18,
                LocalDate.of(2006, 2, 22),
                "reudymamapija@gmail.com",
                "yamasa",
                "calle 123 Juan Pablo"
            );

            Clientes fernando = new Clientes(
                "Fernando",
                "Villa nueva",
                27,
                LocalDate.of(1998, 7, 29),
                "villanuevafernando@gmail.do.com",
                "mexico",
                "calle 123 las casitas"
            );
            repository.saveAll(List.of(cluadia, motete, rudesca, fernando));
        };
    }

}
