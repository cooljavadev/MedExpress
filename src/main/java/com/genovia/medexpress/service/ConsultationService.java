package com.genovia.medexpress.service;

import com.genovia.medexpress.exception.ConsultationResponseNotFoundException;
import com.genovia.medexpress.model.Consultation;
import com.genovia.medexpress.model.ConsultationDecision;
import com.genovia.medexpress.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    public ConsultationDecision addConsultation(Consultation consultation) {
        consultation.setConsultationId(UUID.randomUUID().toString().split("-")[0]);

       //business logic to take decision about consultation questions
        ConsultationDecision consultationDecision = new ConsultationDecision();
        consultationDecision.setDecisionId(UUID.randomUUID().toString().split("-")[0]);
        consultation.getTreatment().getQuestions().forEach(q->{

          if(q.getResponse()== null) {
              throw new ConsultationResponseNotFoundException("consultation response not found for question ID"+q.getQuestionId());
          }
          else if(q.getResponse().equals("no"))
            {
                consultationDecision.setResponse("This treatment is not suitable for you because you may have another allergy condition. We recommend contacting your GP for further advice");

            }
            else {
                consultationDecision.setResponse("Specialists will review your case and will prescribe medicines");

            }

        });
        consultationRepository.save(consultation);

        return consultationDecision;
    }


}

