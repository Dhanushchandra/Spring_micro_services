package com.quiz.quiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    transient private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public Quiz(String title, List<Question> questions, int id) {
        this.title = title;
        this.questions = questions;
        this.id = id;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Quiz() {
    }
}
