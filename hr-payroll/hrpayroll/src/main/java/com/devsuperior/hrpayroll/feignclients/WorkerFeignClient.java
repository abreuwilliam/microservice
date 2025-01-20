package com.devsuperior.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import com.devsuperior.hrpayroll.entities.Worker;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


@Component
@FeignClient(name = "hrworker", path = "/workers")
public interface WorkerFeignClient {
    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findAll(@PathVariable Long id);
}

