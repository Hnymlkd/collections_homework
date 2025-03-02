package interfaces;

public interface MyList<T> extends Iterable<T>, Printable {
    void add(T element);
    T get(int index);
    T remove(int index);
    int size();
    boolean isEmpty();
}
