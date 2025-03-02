package interfaces;

public interface MyTreeMap<K extends Comparable<K>, V> extends Printable {
    void put(K key, V value);
    V get(K key);
    V remove(K key);
    boolean containsKey(K key);
    int size();
    boolean isEmpty();
}
