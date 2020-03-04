package com.ckd.list;

import java.util.Arrays;

/**
 * @auther: dck
 * @Date: 2020/2/18
 * @Description:
 */
public class CusArrayList<E> implements  List<E>{

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ARR = {};
    private  Object[] arr;
    private int size;

    public CusArrayList(int capacity) {
        if (capacity >0){
            arr = new Object[capacity];
        }else if (capacity == 0){
            arr = EMPTY_ARR;
        }else {
            throw  new IllegalArgumentException("Illegal Argument:"+capacity);
        }
    }

    public CusArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E e) {
        for (Object data : arr) {
            if (data.equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        if (index <0 || index >= size){
            throw new IllegalArgumentException("数组越界");
        }
        return (E) arr[index];
    }

    @Override
    public void set(int index, E e) {
        if (index <0 || index >= size){
            throw new IllegalArgumentException("数组越界");
        }
        arr[index] = e;
    }

    @Override
    public void add(int index, E e) {
        if (index <0 || index > size){
            throw new IllegalArgumentException("数组越界");
        }
        //扩容
        if (size == arr.length){
            grow( 2 * arr.length);
        }
        for (int i=size-1;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = e;
        size ++;
    }

    @Override
    public E remove(int index) {
        if (index <0 || index >= size){
            throw new IllegalArgumentException("数组越界");
        }
        Object val = arr[index];
        if (size < arr.length /2){
            grow(arr.length /2);
        }
        for (int i = index +1;i<size;i++){
            arr[i-1] = arr[i];
        }
        arr[size-1] = null;
        size --;
        return (E) val;
    }

    private void grow(int newCapacity){
        Arrays.copyOf(arr,newCapacity);
    }
}
