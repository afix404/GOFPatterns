package org.example.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(5);
        myList.add("Java");
        myList.add("Learning");
        myList.add("Patterns");

        System.out.println(myList.size());

        MyIterator<String> iterator = myList.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("qwe1");
        linkedList.add("qwe2");
        linkedList.add("qwe3");
        Iterator<String> llIterator = linkedList.iterator();
    }
}
