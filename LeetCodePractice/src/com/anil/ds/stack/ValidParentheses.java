package com.anil.ds.stack;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{([{}])()}()";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s));
    }
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        char cArr[]= s.toCharArray();
        for(char c: cArr){
            if(c == '{' || c == '(' || c=='[')
                characterStack.push(c);
            else {
                if(characterStack.empty())
                    return false;
                char c1 = characterStack.pop();
                if(c=='}' && c1!='{')
                    return false;
                else if(c==']' && c1!='[')
                    return false;
                else if(c==')' && c1!='(')
                    return false;
            }
        }
        if(characterStack.size() !=0)
            return false;
        return true;
    }

}
