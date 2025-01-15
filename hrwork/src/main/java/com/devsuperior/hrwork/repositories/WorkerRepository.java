package com.devsuperior.hrwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrwork.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
    
}
