package com.question.question.controller;

import com.question.question.model.Question;
import com.question.question.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionsService questionsService;

    @GetMapping
    public List<Question> allQuestions(){
        return questionsService.getAllQuestions();
    }

    @PostMapping
    public Question saveQuestion(@RequestBody Question question){
        return questionsService.saveQuestion(question);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuizQuestions(@PathVariable int quizId){
        return questionsService.getQuizQuestions(quizId);
    }

}
