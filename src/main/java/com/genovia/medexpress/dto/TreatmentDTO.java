package com.genovia.medexpress.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TreatmentDTO {
    private String treatmentId;
    private String name;
    private String description;
}
