package org.example.iterator;

import java.util.NoSuchElementException;

public class MyList<T> implements MyCollection<T> {

    private class MyListIterator<T> implements MyIterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
           if (!hasNext()) {
               throw new NoSuchElementException();
           }
           return (T) items[currentIndex++];
        }
    }

    private T[] items;
    private int count;

    public MyList(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    public int size() {
        return count;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public MyIterator<T> createIterator() {
        return new MyListIterator<>();
    }
}
