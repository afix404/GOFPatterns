package org.example.visitor;

public class Visitor implements TovarVisitor{




    @Override
    public void visit(Tovar tovar) {
        System.out.println("Стоимость товара с учетом налога " + tovar.getPrice());
        System.out.println("Информация о товаре: " + tovar.getInformation());
    }
}
