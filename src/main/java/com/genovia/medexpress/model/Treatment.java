package com.genovia.medexpress.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "treatment")
public class Treatment {
    @Id
    private String treatmentId;
    private String name;
    private String description;
    private List<Question> questions;

    public String getTreatmentId() {
        return treatmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
