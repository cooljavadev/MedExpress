package com.genovia.medexpress.service;

import com.genovia.medexpress.dto.TreatmentDTO;
import com.genovia.medexpress.model.Treatment;
import com.genovia.medexpress.repository.ConsultationRepository;
import com.genovia.medexpress.repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;


    public List<Treatment> findTreatments() {
       return treatmentRepository.findAll();
    }
}
