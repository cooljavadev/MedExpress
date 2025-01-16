package com.genovia.medexpress.controller;

import com.genovia.medexpress.model.Treatment;
import com.genovia.medexpress.repository.TreatmentRepository;
import com.genovia.medexpress.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class TreatmentController {

    @Autowired
    private TreatmentRepository treatmentRepository;

    @GetMapping("/treatments")
    public List<Treatment> getTreatments() {
        return treatmentRepository.findAll();
    }

    @PostMapping("/treatment")
    public Treatment createTreatment(@RequestBody Treatment treatment) {
        treatment.setTreatmentId(UUID.randomUUID().toString().split("-")[0]);
        treatment.getQuestions().forEach(q->q.setQuestionId(UUID.randomUUID().toString().split("-")[0]));
        return treatmentRepository.save(treatment);
    }

    @GetMapping("/treatment/{id}")
    public Treatment getTreatment(@PathVariable String id) {
        return treatmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Treatment not found"));
    }

}
