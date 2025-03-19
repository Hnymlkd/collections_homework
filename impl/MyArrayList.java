package impl;

import interfaces.MyList;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>  {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size = 0;


    public MyArrayList() {
        this.array = (T[])new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity){
        if(capacity < 0){
            capacity = DEFAULT_CAPACITY;
        }
        array = (T[]) new Object[capacity];
    }

    private void ensureCapacity(){
        if(size == array.length){
            T[] oldArray = array;
            array = (T[]) new Object[oldArray.length*2];
            for(int i =0; i < oldArray.length; i++){
                array[i] = oldArray[i];
            }
        }
    }


    @Override
    public void add(T element) {
        ensureCapacity();
        array[size] = element;
        size++;

    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("нет элемента с таким индексом");
        }
        return array[index];
    }

    @Override
    public T remove(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("нет элемента с таким индексом");
        }
        T element = array[index];
        array[index] = null;
        size--;
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    @Override
    public String toString() {
        String result =  "[";
        for(int i = 0; i < size; i++) {
            result += array[i];
            if (i < size -1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(array,size);
    }

    public static void main(String[] args){
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("A");
        myArrayList.add("B");
        myArrayList.add("C");
        myArrayList.add("D");

/*      System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(5));
        System.out.println(myArrayList.get(-5));
        System.out.println(myArrayList.get(3));
*/

        myArrayList.remove(3);

        System.out.println(myArrayList.size());

        System.out.println(myArrayList.isEmpty());

        System.out.println(myArrayList.toString());
    }
}


