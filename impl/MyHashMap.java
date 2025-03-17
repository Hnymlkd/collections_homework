package impl;

import interfaces.MyMap;

import java.util.HashMap;

public class MyHashMap<K,V> implements MyMap<K,V> {

    public HashMap<K, V> hashmap = new HashMap<>();

    public void put(K key, V value) {
        hashmap.put(key, value);
    }

    public V get(K key) {
        return hashmap.get(key);
    }

    public V remove(K key) {
        return hashmap.remove(key);
    }

    public boolean containsKey(K key) {
        return hashmap.containsKey(key);
    }

    public int size() {
        return hashmap.size();
    }

    public boolean isEmpty() {
        return hashmap.isEmpty();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return hashmap.hashCode();
    }

    public Iterable<K> keySet() {
        return hashmap.keySet();
    }

    public Iterable<V> values() {
        return hashmap.values();
    }

    @Override
    public String toString() {
        return "";
    }
}
