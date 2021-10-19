package com.example.demo.controller;

import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(name = "/listar/clientes")
    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    @PostMapping(name = "/salvar/clientes")
    ResponseEntity<ClienteModel> post(@RequestBody ClienteModel clienteModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }
}
