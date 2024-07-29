package com.application.myproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myproject.models.Clientes;
import com.application.myproject.services.Service;

@RestController
@RequestMapping(path = "/inicio")
public class Controller {
    private Service service;


    @Autowired
    public Controller(Service service){
        this.service = service;
    }

    @GetMapping("/clientes")
    public List<Clientes> getClientes(){
        return service.getClientes();
    }


}
