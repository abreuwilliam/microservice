package com.devsuperior.hrwork.resources;

import java.util.List;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.devsuperior.hrwork.entities.Worker;
import com.devsuperior.hrwork.repositories.WorkerRepository;

@CrossOrigin(origins = "*") 

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
    @Autowired
    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository repository;

    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Worker>> findAll(@PathVariable Long id) {
       
        logger.info("Port ="+ env.getProperty("local.server.port"));

        Optional<Worker> list = repository.findById(id);
        
        return ResponseEntity.ok(list);
    }


}