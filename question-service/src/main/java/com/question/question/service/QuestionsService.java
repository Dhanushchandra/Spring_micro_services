package com.question.question.service;

import com.question.question.model.Question;
import com.question.question.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public Question saveQuestion(Question question){
        return  questionRepository.save(question);
    }

    public List<Question> getQuizQuestions(int quizId) {
        return  questionRepository.findAllByQuizId(quizId);
    }
}
