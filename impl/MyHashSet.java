package impl;

import interfaces.MySet;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet<T> implements MySet<T> {

    public HashSet<T> hashset = new HashSet();

    public boolean add(T element) {
        return hashset.add(element);
    }

    public boolean remove(T element) {
        return hashset.remove(element);
    }

    public boolean contains(T element) {
        return hashset.contains(element);
    }

    public int size() {
        return hashset.size();
    }

    public boolean isEmpty() {
        return hashset.isEmpty();
    }

    public String print() {
        return "";
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


}