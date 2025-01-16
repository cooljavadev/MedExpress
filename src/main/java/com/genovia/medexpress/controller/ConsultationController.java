package com.genovia.medexpress.controller;

import com.genovia.medexpress.exception.ConsultationResponseNotFoundException;
import com.genovia.medexpress.model.Consultation;
import com.genovia.medexpress.model.ConsultationDecision;
import com.genovia.medexpress.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @PostMapping("/consultation")
    public  ResponseEntity<Object> createConsultation(@RequestBody Consultation consultation) {


        try{
           return new ResponseEntity<>(consultationService.addConsultation(consultation),HttpStatus.OK);
        }catch (ConsultationResponseNotFoundException e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }
}
