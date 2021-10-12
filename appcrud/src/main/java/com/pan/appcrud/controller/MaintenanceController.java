package com.pan.appcrud.controller;

import com.pan.appcrud.entity.Maintenance;
import com.pan.appcrud.repository.MaintenanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api")
public class MaintenanceController {

    @Autowired
    MaintenanceRepo maintenanceRepo;

    @GetMapping(name = "/listar")
    public List<Maintenance> findAll(){
        return maintenanceRepo.findAll();
    }

    @PostMapping(name = "/criar")
    public void criar(@RequestBody Maintenance maintenance){
        maintenanceRepo.save(maintenance);
    }
}
