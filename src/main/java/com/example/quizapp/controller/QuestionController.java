package com.example.quizapp.controller;


import com.example.quizapp.model.Questions;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){

        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable("category") String category){
        return  questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Questions question){

        return questionService.addQuestion(question);
    }
}
