package impl;

import interfaces.MyMap;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int SIZE = 16; // размер массива
    private Entry<K, V>[] table; // массив где гранятся данные

    public MyHashMap() {
        table = new Entry[SIZE]; // новый массив фиксированного размера
    }

    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next; // если два ключа попали в один индекс, они образуют цепочку (next)

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(K key) { // метод вычисляет индекс в массиве table[], куда должен попасть ключ
        return (key == null) ? 0 : Math.abs(key.hashCode() % SIZE); // берет hashCode() ключа, делает его положительным и приводит к размеру массива table[]
    }

    @Override
    public void put(K key, V value) {
        int index = hash(key); // определяем, в какой ящик положить
        Entry<K, V> newEntry = new Entry<>(key, value); // создаем новую бумажку

        if (table[index] == null) {
            table[index] = newEntry; // если ячейка пустая, тогда вставляем
        } else {
            Entry<K, V> curr = table[index]; // берем первую бумажку
            Entry<K, V> prev = null; // вспомогательный указатель (чтобы помнить предыдущее значение)

            while (curr != null) {
                if (curr.key.equals(key)) { // если ключ совпадает, заменяем значение
                    curr.value = value;
                    return;
                }
                prev = curr; //апоминаем текущий элемент
                curr = curr.next; // переходим к следующему
            }
            prev.next = newEntry;
        }
    }

    @Override
    public V get(K key) {
        int index = hash(key); // найти ящик (hash(key))
        Entry<K, V> curr = table[index]; // открываем ящик и начинаем искать

        while (curr != null) { //проверяем каждую бумажку
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next; // переходим к следующему элементу
        }
        return null;
    }
//допустим, в нашем ящике (table[1]) лежат карточки: Dinara: 30 → Diana: 40 → Didar: 50
    @Override
    public V remove(K key) {
        int index = hash(key); //найти, в каком ящике лежит ключ
        Entry<K, V> curr = table[index]; //первая карточка (Dinara: 30)
        Entry<K, V> prev = null; //вспомогательный указатель - пока null, потому что "Dinara" первая

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    table[index] = curr.next; //если удаляем первый элемент (например, "Dinara"), просто меняем table[index]
                } else {
                    prev.next = curr.next; //Что было: Dinara: 30 → Diana: 40 → Didar: 50, Что стало после удаления "Diana": Dinara: 30 → Didar: 50
                }
                return curr.value; //возвращаем удаленное значение
            }
            prev = curr;
            curr = curr.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return get(key) != null; //значение not null → ключ существует → возвращаем true
    }

    @Override
    public int size() {
        int count = 0; //счетчик элементов

        //проходим по всей таблице
        for (Entry<K, V> bucket : table) {
            while (bucket != null) { //пока в ячейке есть элементы
                count++; //увеличиваем счетчик
                bucket = bucket.next; //переходим к следующему элементу если есть
            }
        }
        return count; //возвращаем общее число элементов
    }

    @Override
    public boolean isEmpty() {
        return size() == 0; //если size() вернул 0 → таблица пустая
    }

    @Override
    public Iterable<K> keySet() {
        return null;
    }

    @Override
    public Iterable<V> values() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{"); //начинаем со строки "{"
        for (Entry<K, V> bucket : table) { //проходим по всем ячейкам массива table
            while (bucket != null) { //если в ячейке есть элементы (цепочка)
                sb.append(bucket.key).append("=").append(bucket.value).append(", "); //добавляем "ключ=значение"
                bucket = bucket.next; //переход к следующему элементу в цепочке
            }
        }
        if (sb.length() > 1) sb.setLength(sb.length() - 2); //убираем последнюю запятую и пробел
        sb.append("}"); //закрываем строку
        return sb.toString(); //возвращаем строку
    }
}
