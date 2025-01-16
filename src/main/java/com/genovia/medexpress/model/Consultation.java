package com.genovia.medexpress.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "consultation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    @Id
    private String consultationId;
    private Treatment treatment;

    public Treatment getTreatment() {
        return treatment;
    }

    public String getConsultationId() {
        return consultationId;
    }
}
