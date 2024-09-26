package org.example.designpatterns.behavioral.interpreter.infixtopostfix;

public class InterpreterPatternClient {
    public static void main(String[] args)
    {
        String infix = "1+2*3";

        InfixToPostfixPattern ip=new InfixToPostfixPattern();

        String postfix = ip.conversion(infix);
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + postfix);
    }
}
