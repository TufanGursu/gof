package org.example.designpatterns.behavioral.interpreter.infixtopostfix;

import java.util.Stack;
/*
The InfixToPostfixPattern class is designed to convert an i
nfix expression (where operators are between operands) to a postfix expression
 (where operators follow their operands).
 This class implements the Pattern interface,
 which requires the implementation of the conversion method.

The method iterates over each character in the input expression.
 If the character is an operator (+, -, *, /, %),
 it checks the precedence of the operators in the stack against the current operator.
 If the operator at the top of the stack has higher or equal precedence,
 it pops operators from the stack and appends them to the postfix string
 until it finds an operator with lower precedence or the stack is empty.

 https://www.geeksforgeeks.org/convert-infix-expression-to-postfix-expression/
 */
public class InfixToPostfixPattern implements Pattern {
    @Override
    public String conversion(String exp) {
        String postfix = "";
        Stack<Character> s1 = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                while (!s1.isEmpty() && precedence(s1.peek()) >= precedence(ch)) {
                    postfix += s1.pop();
                }
                s1.push(ch);
            } else {
                postfix += ch;
            }
        }

        while (!s1.isEmpty()) {
            postfix += s1.pop();
        }

        return postfix;
    }

    private int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return -1;
    }
}
