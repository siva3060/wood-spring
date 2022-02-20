package com.sivacharan.woodspring.models;

import lombok.Data;

@Data
public class Mcq {
    private final String question;
    private final String[] options;

    public Mcq(String question, String[] options) {
        this.question = question;
        this.options = options;
    }

}
