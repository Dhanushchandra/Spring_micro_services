package com.quiz.quiz.service;

import com.quiz.quiz.model.Quiz;
import com.quiz.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;

    public List<Quiz> getAllQuiz(){
        List<Quiz> quizzes = quizRepository.findAll();

        List<Quiz> newQuizList =  quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsForQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());


        return newQuizList;
    }

    public Quiz saveQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }

}
