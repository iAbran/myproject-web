package com.application.myproject.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.myproject.models.Clientes;
import com.application.myproject.repository.ClientesRepository;


@org.springframework.stereotype.Service
public class Service {
    private ClientesRepository clienteRepository;

    @Autowired
    public Service(ClientesRepository clientesRepository){
        this.clienteRepository = clientesRepository;
    }

public List<Clientes> getClientes() {
        return clienteRepository.findAll();
    }
}


