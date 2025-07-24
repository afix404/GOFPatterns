package org.example.state;



public interface ZakazStatus {

    void created();
    void paid();
    void delivered();
    void cancelled();
}
