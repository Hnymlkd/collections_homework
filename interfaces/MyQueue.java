package interfaces;

public interface MyQueue<T> extends Printable {
    void enqueue(T element);  //add
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
}
