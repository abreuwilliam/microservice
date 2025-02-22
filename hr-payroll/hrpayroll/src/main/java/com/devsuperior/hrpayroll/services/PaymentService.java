package com.devsuperior.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {


   @Autowired
   private WorkerFeignClient workerFeignClient;

   public Payment getPayment(long workerId, int days) {

  Worker worker = workerFeignClient.findAll(workerId).getBody();
  
    return new Payment(worker.getName(),worker.getDailyIncome(),days);
    
   } 
}   
