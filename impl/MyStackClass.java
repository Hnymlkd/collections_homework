package impl;

import interfaces.MyStack;

import java.util.Stack;

public class MyStackClass<T> implements MyStack<T> {

    public Stack<T> stack = new Stack<>();

    public void push(T element) {
        stack.push(element);
    }


    public T pop() {
        return stack.pop();
    }


    public T peek() {
        return stack.peek();
    }


    public int size() {
        return stack.size();
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String print() {
        return "";
    }
}
