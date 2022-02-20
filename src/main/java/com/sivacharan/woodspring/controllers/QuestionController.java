package com.sivacharan.woodspring.controllers;

import com.sivacharan.woodspring.models.mcq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *      We will track the next question from JWT data
 */
@RestController("/question")
public class QuestionController {
    public static final String yettoimplement = "Yet to Implement";

    @GetMapping("/next")
    public String getNextQuestion(){
        return yettoimplement;
    }

}
