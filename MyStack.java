public interface MyStack<T> extends Printable {
    void push(T element);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
