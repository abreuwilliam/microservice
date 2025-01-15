package com.devsuperior.hrwork.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.devsuperior.hrwork.entities.Worker;
import com.devsuperior.hrwork.repositories.WorkerRepository;

@CrossOrigin(origins = "*") 

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {


    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
       
        List<Worker> list = repository.findAll();
        
        return ResponseEntity.ok(list);
    }


}