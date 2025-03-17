package impl;

import interfaces.MyPriorityQueue;

import java.util.PriorityQueue;

public class MyPriorityQueueClass<T extends Comparable<T>> implements MyPriorityQueue<T> {

    public PriorityQueue<T> priorityQueue = new PriorityQueue<>();

    public void insert(T element) {
        priorityQueue.add(element);
    }

    public T extractMin() {
        return priorityQueue.poll();
    }

    public T peek() {
        return priorityQueue.peek();
    }

    public int size() {
        return priorityQueue.size();
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public String toString() {
        return "";
    }
}
