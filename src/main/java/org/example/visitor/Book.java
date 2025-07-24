package org.example.visitor;

public class Book implements Tovar{

    Integer tovarPrice;

    String info;

    public Book(Integer tovarPrice, String info) {
        this.tovarPrice = tovarPrice;
        this.info = info;
    }

    @Override
    public Integer getPrice() {
        return (int) (tovarPrice*1.18);
    }

    @Override
    public String getInformation() {
        return info;
    }

}
