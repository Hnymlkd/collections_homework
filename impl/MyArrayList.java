package impl;

import interfaces.MyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size = 0;

    public MyArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        array = (T[]) new Object[capacity];
    }

    private void ensureCapacity() {
        if (size == array.length) {
            T[] newArray = array;
            array = (T[]) new Object[array.length * 2];
            for (int i = 0; i < newArray.length; i++) {
                array[i] = newArray[i];
            }
        }
    }

    @Override
    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public T remove(int index) {
        T element = array[index];

        /*System.arraycopy(array, index + 1, array, index, size - index - 1);*/
        size--;
        return element;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String print() {
        return "";
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
