package com.ckd.list;

/**
 * @author dck
 * @date 2020/2/18
 */
public interface List<E> {

    int getSize();

    boolean isEmpty();

    boolean contains(E o);

    int indexOf(E o);

    E get(int index);

    void  set(int index,E e);

    void  add(int index,E e);

    E remove(int index);


}
