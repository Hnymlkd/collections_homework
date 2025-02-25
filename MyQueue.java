public interface MyQueue<T> extends Printable{
    void enqueue(T element);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
}
