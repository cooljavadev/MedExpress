# MedExpress
Demo Project for Medexpress Consulation

# Database
It uses embedded Mongo DB to create collections, documents. 

# How to Build
>mvn clean install

# HOW to Run
>mvn spring-boot:run

# Postman Collection
3 requests- 
1. create new treatments
Postman request to create new treatment options available with us. We add new treatments
as we go on and as per market demand

2. Get all Treatments
This will return all Treatments available with us and for which we can provide consultation and prescription


3. Submit Treatment Answers(create consultation)
This endpoint will accept answers for all question which are asked under a specific treatment.we will validate 
if any allergy and response fields. Depending on answer either consultation will be provided or rejected.


