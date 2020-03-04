package com.ckd.list;

/**
 * @auther: dck
 * @Date: 2020/2/24
 * @Description:
 */
public class CusLinkedList implements List {

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void set(int index, Object o) {

    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    class Node {
        Object data;
        Node next;
    }
}
