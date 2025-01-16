package com.genovia.medexpress.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataMongoTest()
@ExtendWith(SpringExtension.class)
public class TreatmentRepositoryTest {
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    TreatmentRepository treatmentRepository;

    @Order(1)
    @Test
    void testDb() {
        Assertions.assertThat(mongoTemplate.getDb()).isNotNull();
    }

}
