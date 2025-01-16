package com.genovia.medexpress.repository;

import com.genovia.medexpress.model.Treatment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepository extends MongoRepository<Treatment, String> {
}
