package impl;

import interfaces.MyList;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>  {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size = 0;

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
    }

    private void ensureCapacity() {
    }

    @Override
    public void add(T element) {
    }

    @Override
    public T get(int index) {
    }

    @Override
    public T remove(int index) {
    }

    @Override
    public int size(){
    }


    @Override
    public boolean isEmpty() {
    }

    @Override
    public String toString() {
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(array, size);
    }

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Iterator<Integer> iterator = arrayList.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

        System.out.println(arrayList);
    }
}


