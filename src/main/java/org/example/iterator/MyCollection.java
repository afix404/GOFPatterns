package org.example.iterator;

public interface MyCollection<T> {
    MyIterator<T> createIterator();
}
