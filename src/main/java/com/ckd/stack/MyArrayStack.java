package com.ckd.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @auther: dck
 * @Date: 2020/2/28
 * @Description:
 */
public class MyArrayStack<T> implements  MyStack<T> {
    private static final  int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayStack(int capacity) {
        this.data = new Object[capacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T ele) {
        data[size ++] = ele;
        if (size == data.length){
            grow(data.length * 2);
        }
    }

    @Override
    public T pop() {
        if (size == 0){
            throw new EmptyStackException();
        }
        if (size < data.length/2){
            grow(data.length/2);
        }
        return (T) data[--size];
    }

    @Override
    public T peek() {
        if (size == 0){
            throw new EmptyStackException();
        }
        return (T) data[size-1];
    }

    private void grow(int newCapacity){
        data = Arrays.copyOf(data, newCapacity);
    }

    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack();
        for (int i =0;i<20;i++){
            stack.push(i+1);
        }
        System.out.println(Arrays.toString(stack.data));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
