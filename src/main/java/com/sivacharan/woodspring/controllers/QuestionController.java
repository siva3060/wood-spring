package com.sivacharan.woodspring.controllers;

import com.sivacharan.woodspring.models.Mcq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 *      We will track the next question from JWT data
 */
@RestController
public class QuestionController {

    @GetMapping("/question")
    public Mcq getNextQuestion(){
        String question = "What is the capital of India";
        String[] options = new String[]{"Mumbai","New Delhi","Bangalore","Hyderabad"};
        return new Mcq(question,options);
    }

    @GetMapping
    public ArrayList<Mcq> getAllQuestions(){
        return null;
    }

}
