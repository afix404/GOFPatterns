package org.example.visitor;

public class Electronic implements Tovar{
    Integer tovarPrice;

    String info;

    public Electronic(Integer tovarPrice, String info) {
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
