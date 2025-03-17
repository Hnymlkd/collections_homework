package impl;

import java.util.Iterator;

public class MyListIterator<T> implements Iterator<T> {

    private final T[] array;
    private int index = 0;
    private final int size;

    public MyListIterator(T[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T element = array[index];
        index++;
        return element;
    }
}
