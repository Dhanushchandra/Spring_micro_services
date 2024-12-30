package com.quiz.quiz.controller;

import com.quiz.quiz.model.Quiz;
import com.quiz.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping
    public List<Quiz> getAllquiz(){
        return quizService.getAllQuiz();
    }

    @PostMapping
    public Quiz postQuiz(@RequestBody Quiz quiz){
        return quizService.saveQuiz(quiz);
    }

}
