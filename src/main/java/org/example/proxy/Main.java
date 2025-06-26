package org.example.proxy;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        RealApiService realApiService = new RealApiService();
        ExternalApiService securedAPIServiceProxy = new SecuredAPIServiceProxy(realApiService);
        /*securedAPIServiceProxy.fetchData("111", "nevalid");*/
        securedAPIServiceProxy.fetchData("111", "valid_token");

    }




}
