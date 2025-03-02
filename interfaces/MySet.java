package interfaces;

public interface MySet<T> extends Iterable<T>, Printable {
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
}