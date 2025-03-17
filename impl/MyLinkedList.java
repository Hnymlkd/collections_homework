package impl;

import interfaces.MyList;
import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> first;
    private int size = 0;


    @Override
    public String toString() {
    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }


    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item) {
            this.item = item;
        }
    }



    public void add(T element) {
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.remove(0);
    }

    public T get(int index) {
    }

    public T remove(int index) {
    }

    public int size() {
    }

    public boolean isEmpty() {
    }
}
