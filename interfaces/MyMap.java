package interfaces;

public interface MyMap<K, V> extends Printable {
    void put(K key, V value);
    V get(K key);
    V remove(K key);
    boolean containsKey(K key);
    int size();
    boolean isEmpty();
    Iterable<K> keySet();
    Iterable<V> values();
}
