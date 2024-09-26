package org.example.designpatterns.structural.bridge.questionmanager;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternsQuestions implements Question {
    private List<String> questions = new ArrayList<String>();
    private int current = 0;
    public DesignPatternsQuestions(){
        questions.add("How many types of design patterns are there? ");
        questions.add("What is singleton design pattern? ");
        questions.add("Is factory method pattern creational or structural? ");
    }
    public void nextQuestion() {
        if( current <= questions.size()-1 )
            current++;
        System.out.print(current);
    }

    public void previousQuestion() {
        if( current > 0 )
            current--;
    }

    public void newQuestion(String quest) {
        questions.add(quest);
    }

    public void deleteQuestion(String quest) {
        questions.remove(quest);
    }

    public void displayQuestion() {
        System.out.println( questions.get(current) );
    }
    public void displayAllQuestions() {
        for (String quest : questions) {
            System.out.println(quest);
        }
    }
}
