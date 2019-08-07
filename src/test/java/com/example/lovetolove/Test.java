package com.example.lovetolove;

import java.io.IOException;
import java.util.Stack;

public class Test {

    public static void main(String[] args) throws IOException {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        int returnValue = 0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<String>();

        for (String t : tokens) {
            if (!operators.contains(t)) { //如果是数字，就放在栈里
                stack.push(t);
            } else {//如果是操作符就从栈里取出数字
                int a = Integer.valueOf(stack.pop());
                System.out.println(a+"==a==");
                int b = Integer.valueOf(stack.pop());
                System.out.println(b+"==b==");
                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }

        returnValue = Integer.valueOf(stack.pop());

        return returnValue;
    }
}