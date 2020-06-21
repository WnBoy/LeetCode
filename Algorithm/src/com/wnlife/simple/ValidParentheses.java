package com.wnlife.simple;

import java.util.Stack;

/**
 * @author Wnlife
 * @create 2020-06-13 22:51
 */
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean valid = validParentheses.isValid("((");
        System.out.println(valid);
    }


    public boolean isValid(String s) {
        if(s==""||s.isEmpty())return true;
        if (s == null||s.length()<=1) return false;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty()&&judgeChars(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }

    public boolean judgeChars(char c1, char c2) {
        return (Math.abs(c1 - c2) <= 2)&&(c1!=c2);
    }

}
