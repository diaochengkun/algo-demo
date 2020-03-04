package com.ckd.stack;

public interface MyStack<T> {
    int size();
    boolean isEmpty();
    void push(T  ele);
    T pop();
    T peek();
}
