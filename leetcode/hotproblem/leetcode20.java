package com.springmvc.leetcode.hotproblem;

import java.util.Stack;

public class leetcode20 {
    public static void main(String[] args) {
        String str="(})";

        System.out.println(isValid(str));
    }
    public static  boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){

                    if(stack.empty()){
                        return false;
                    }else{
                        if(s.charAt(i)==')'&&stack.peek()=='(') {
                            stack.pop();
                        }else if(s.charAt(i)=='}'&&stack.peek()=='{'){
                            stack.pop();
                        } else if(s.charAt(i)==']'&&stack.peek()=='['){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }
            }
        }

        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}
