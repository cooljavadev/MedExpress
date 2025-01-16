package com.genovia.medexpress.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
public class Question {


    @Id
    private String questionId;
    private String text;
    private String type;
    private String response;


    public String getQuestionId() {
        return questionId;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getResponse() {
        return response;
    }
}
