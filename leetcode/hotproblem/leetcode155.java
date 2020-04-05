package com.springmvc.leetcode.hotproblem;

import java.util.Stack;

public class leetcode155 {

    static Stack<Integer> s1=new Stack();
    static Stack<Integer> s2=new Stack();

    public leetcode155() {

    }

    public void push(int x) {
        s1.push(x);
        if(s2.empty()||(s2.peek()>x)){
            s2.push(x);
        }else{
            s2.push(s2.peek());
        }
    }

    public void pop() {
        if(s1.empty()){
            return;
        }
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
