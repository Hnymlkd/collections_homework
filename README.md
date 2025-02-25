# Домашнее задание по коллекциям

Необходимо сделать fork от этого проекта и работать в своем проекте. 
По завершению работы нужно отправить мне PR на этот проект на ветку main.

Само задание заключается в написании реализации для этих интерфейсов, кроме MyPriorityQueue и MyTreeMap (они бонусные).
Должны быть классы:
* MyArrayList<T>
* MyLinkedList<T>
* MyHashSet<T> 
* MyHashMap<K, V> (не забудь про equals и hashcode)
* MyQueueClass<T>
* MyStackClass<T>
* MyPriorityQueueClass<T> (opt)
* MyTreeMapClass<K, V> (opt)

Классы должны располагаться в папке impl

Основная структура данных для каждой реализации должна совпадать с аналогичной структурой в Java Collection Framework
Т.е Arraylist использует `transient Object[] elementData;`, значит и MyArrayList должен опираться на него, либо аналог `T[] elementData`. 
LinkedList использует класс Node и поинтеры к началу и концу, к примеру `transient Node<E> first;`, 
значит и MyLinkedList должен это использовать (можно без transient) и т.д.

По аналогии также в конструкторе должна быть возможность задать начальные size и capacity для этих структур. 
Расти они должны по аналогии с классами из JCF. Т.е. в MyArrayList используется array, и должно быть также как тут:
When the array reaches its capacity, `ArrayList` increases its size by 50% of the current capacity (i.e., 1.5 times)

Решать с помощью ChatGPT и его аналогов КАТЕГОРИЧЕСКИ запрещено, можно только спрашивать у него теорию.
Азу просить решить тоже нельзя, можно только попросить объяснить теорию.
Все остальные источники разрешены.

Теория которую надо будет пройти, чтобы получилось решить задание:
* Generics 
* Exception Handling 
* Data Structures
* Iterable & Iterator

Дедлайн 6 марта. В эту субботу прогоню по теории и подскажу некоторые моменты, если к тому времени начнешь делать.