package org.example.designpatterns.structural.bridge.questionmanager;

// this is the BridgePatternDemo class.
public class BridgePatternDemo {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestions();
        questions.delete("What is class? ");
        questions.display();
        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();

        QuestionFormat questions2 = new QuestionFormat("Design Patterns");
        questions2.q = new DesignPatternsQuestions();
        questions2.newOne("What is bridge design pattern? ");
        questions2.display();
        questions2.displayAll();
    }
}// End of the BridgePatternDemo class.
