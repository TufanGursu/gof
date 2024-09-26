package org.example.designpatterns.behavioral.interpreter.processpostfix;

public class ExpressionParserTest {
    public static void main(String[] args) {
        String postfix = "2 1 5 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(postfix);
        System.out.println("Final result: " + result);  ;
    }
}
