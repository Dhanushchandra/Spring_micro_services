package com.quiz.quiz.service;

import com.quiz.quiz.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082",value = "Question-Client")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    public List<Question> getQuestionsForQuiz(@PathVariable int quizId);

}
