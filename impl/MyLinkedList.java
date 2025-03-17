package impl;

import interfaces.MyList;
import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    @Override
    public String toString() {
        return "";
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

    private Node<T> first;
    private int size = 0;

    public void add(T element) {
        if (first == null)
            first = new Node<>(element);
        else {
            Node<T> current = first;
            while (current.next != null)
                current = current.next;
            current.next = new Node<>(element);
        }
        size++;
    }

    public T get(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current.item;
    }

    public T remove(int index) {
        if (index == 0) {
            T item = first.item;
            first = first.next;
            size--;
            return item;
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++)
            current = current.next;
        T item = current.next.item;
        current.next = current.next.next;
        size--;
        return item;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
