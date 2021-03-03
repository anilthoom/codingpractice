package com.anilt.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String s = "([])";
        System.out.println(vp.isValid(s));
    }
    public boolean isValid(String s) {
        char cArr[] = s.toCharArray();
        boolean result = false;
        Stack<Character> characterStack = new Stack<Character>();
        for(char c: cArr){
            result = false;
            if(c == '{' || c=='[' || c=='(')
                characterStack.push(c);
            else if(c == '}' || c==']' || c==')'){
                if(characterStack.empty()){
                    return false;
                }
                char p = characterStack.pop();
                if ((p == '{' && c == '}') || (p == '[' && c == ']') || (p == '(' && c == ')')) {
                    result = true;
                }
                else {
                    return false;
                }
            }

        }
        if(characterStack.isEmpty())
            return result;
        else
            return false;
    }
}
