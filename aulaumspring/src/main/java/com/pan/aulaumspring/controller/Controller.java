package com.pan.aulaumspring.controller;

import com.pan.aulaumspring.entity.Produto;
import com.pan.aulaumspring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/retornoString")
    public String metodo() {
        return "hello";
    }

    @GetMapping("/retornoNumero")
    public int idade() {
        return 1;
    }

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }


}
