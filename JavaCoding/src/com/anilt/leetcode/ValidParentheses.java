package com.anilt.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(vp.isValid(s));
    }
    public boolean isValid(String s) {
        char cArr[] = s.toCharArray();
        Stack<Character> characterStack = new Stack<Character>();
        for(char c: cArr){
            if(c == '{' || c=='[' || c=='(')
                characterStack.push(c);
            else{
                char p = characterStack.pop();
                if ((p == '{' && c == '}') || (p == '[' && c == ']') || (p == '(' && c == ')')) {
                    continue;
                }
                else {
                    return false;
                }
            }

        }
        return true;
    }
}
