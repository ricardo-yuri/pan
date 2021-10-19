package br.com.app.datas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class RootController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
