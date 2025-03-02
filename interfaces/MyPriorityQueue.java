package interfaces;

public interface MyPriorityQueue<T extends Comparable<T>> extends Printable {
    void insert(T element);
    T extractMin();
    T peek();
    int size();
    boolean isEmpty();
}