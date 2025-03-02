package impl;

import interfaces.MyTreeMap;

import java.util.TreeMap;

public class MyTreeMapClass<K extends Comparable<K>, V> implements MyTreeMap<K, V> {

    public TreeMap<K, V> treeMap = new TreeMap<>();

    public void put(K key, V value) {
        treeMap.put(key, value);
    }

    public V get(K key) {
        return treeMap.get(key);
    }

    public V remove(K key) {
        return treeMap.remove(key);
    }

    public boolean containsKey(K key) {
        return treeMap.containsKey(key);
    }

    public int size() {
        return treeMap.size();
    }

    public boolean isEmpty() {
        return treeMap.isEmpty();
    }

    public String print() {
        return "";
    }
}
