package org.example.visitor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Visitor visitor = new Visitor();

        Book book = new Book(3000, "Book");
        Electronic electronic = new Electronic(4000, "Phone");
        Clotching clotching = new Clotching(3000, "Shirt");
        ArrayList<Tovar> arrayList = new ArrayList<>();
        arrayList.add(electronic);
        arrayList.add(clotching);
        arrayList.add(book);
        for (int i = 0; i < arrayList.size(); i++) {
             visitor.visit(arrayList.get(i));
        }

    }
}
